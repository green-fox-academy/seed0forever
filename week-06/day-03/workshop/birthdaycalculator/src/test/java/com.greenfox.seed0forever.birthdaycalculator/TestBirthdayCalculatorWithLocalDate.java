package com.greenfox.seed0forever.birthdaycalculator;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

public class TestBirthdayCalculatorWithLocalDate {

  private static final String EXPECTED_DATE_STR = "2016-11-30";
  private static final LocalDate EXPECTED_DATE = LocalDate.parse(EXPECTED_DATE_STR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  private static final int EXPECTED_DAYS_TO_NEXT_ANNIVERSARY = 224;

  private BirthdayCalculator<LocalDate> birthdayCalculator = new BirthdayWithLocalDate();

  @Test
  public void testParseDate() throws Exception {
    assertEquals(EXPECTED_DATE, birthdayCalculator.parseDate(EXPECTED_DATE_STR));
  }

  @Test(expected = DateTimeParseException.class)
  public void testParseDateNonDate() throws Exception {
    birthdayCalculator.parseDate("nonDate");
  }

  @Test(expected = NullPointerException.class)
  public void testParseDateWithNull() throws Exception {
    birthdayCalculator.parseDate(null);
  }

  @Test
  public void testPrintMonthAndDay() throws Exception {
    String monthAndDay = birthdayCalculator.printMonthAndDay(EXPECTED_DATE);
    assertEquals("11. 30.", monthAndDay);
  }

  @Test(expected = NullPointerException.class)
  public void testPrintMonthAndDayWithNull() throws Exception {
    birthdayCalculator.printMonthAndDay(null);
  }

  @Test
  public void testIsAnniversaryToday() throws Exception {
    String pattern = "MM. dd.";
    boolean expected = EXPECTED_DATE.toString().equals(LocalDate.now().toString());
    assertEquals(expected, birthdayCalculator.isAnniversaryToday(EXPECTED_DATE));
  }

  @Test(expected = NullPointerException.class)
  public void testIsAnniversaryTodayWithNull() throws Exception {
    birthdayCalculator.isAnniversaryToday(null);
  }

  // TODO - fix calculating age in the test method
  @Test
  public void testCalculateAgeInYears() throws Exception {
    int expected = LocalDate.now().getYear() - EXPECTED_DATE.getYear();
    assertEquals(expected, birthdayCalculator.calculateAgeInYears(EXPECTED_DATE));
  }

  @Test(expected = NullPointerException.class)
  public void testCalculateAgeInYearsWithNull() throws Exception {
    birthdayCalculator.calculateAgeInYears(null);
  }

  // TODO - still suspicious. Either this is broken, or the tested method is.
  @Test
  public void testCalculateDaysToNextAnniversary() throws Exception {
    int expected = EXPECTED_DAYS_TO_NEXT_ANNIVERSARY;
    int actual;
    assertEquals(expected, birthdayCalculator.calculateDaysToNextAnniversary(EXPECTED_DATE));

    LocalDate localDate = LocalDate.parse("1980-01-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    expected = 267;
    actual = birthdayCalculator.calculateDaysToNextAnniversary(localDate);
    assertEquals(expected, actual);

/*  // TODO - create new deterministic test instead of this
    localDate = LocalDate.now();
    expected = getExpectedDaysToNextAnniversary(localDate);
    actual = birthdayCalculator.calculateDaysToNextAnniversary(localDate);
    System.out.println("Expected: " + expected);
    System.out.println("Actual: " + actual);
    assertEquals(expected, actual);
*/
  }

  /**
   * @deprecated method's calculation can be off by 1 day in case of leap years.
   */
  @Deprecated
  private int getExpectedDaysToNextAnniversary(LocalDate date) {
    LocalDate now = LocalDate.now();
    int expected;
    if (now.getDayOfYear() == date.getDayOfYear()) {
      expected = 0;
    } else if (now.getDayOfYear() > date.getDayOfYear()) {
      return LocalDate.of(now.getYear(), 12, 31).getDayOfYear() - now.getDayOfYear() + date.getDayOfYear();
    } else {
      return date.getDayOfYear() - now.getDayOfYear();
    }
    return expected;
  }

  @Test(expected = NullPointerException.class)
  public void testCalculateDaysToNextAnniversaryWithNull() throws Exception {
    birthdayCalculator.calculateDaysToNextAnniversary(null);
  }
}
