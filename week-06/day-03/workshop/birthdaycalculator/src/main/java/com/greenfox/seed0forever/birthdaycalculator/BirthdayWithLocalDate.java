package com.greenfox.seed0forever.birthdaycalculator;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    // return with the parsed date; format is: yyyy-MM-dd
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.parse(str, formatter);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    // return the date formatted: month & day (MM. dd.)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
    date.format(formatter);
    return date.format(formatter);
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    // return with true if today is the same month+day as date
    MonthDay receivedMonthDay = MonthDay.of(date.getMonth(), date.getDayOfMonth());
    MonthDay todayMonthDay = MonthDay.from(LocalDate.now());
    return receivedMonthDay.equals(todayMonthDay);
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    // TODO - return how many years age the input date 'birthday' was
    return -1;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
    return -1;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
