package com.greenfox.seed0forever.creditcardreservations;

import com.greenfox.seed0forever.creditcards.CreditCard;
import com.greenfox.seed0forever.creditcards.CreditCardy;
import com.greenfox.seed0forever.reservations.DayOfTheWeek;
import com.greenfox.seed0forever.reservations.ReservationTable;
import com.greenfox.seed0forever.reservations.Reservationy;

public class CreditCardReservation implements Reservationy, CreditCardy {

  public static final String DEFAULT_NAME_FORMAT = "DEF%d";
  private static int counter = 0;

  private int sumCvv;
  private long codeAccount;
  private String nameCardHolder;
  private DayOfTheWeek dowBooking;
  private String codeBooking;

  public CreditCardReservation() {
    nameCardHolder = String.format(DEFAULT_NAME_FORMAT, counter++);
    codeAccount = CreditCard.randomCreditCardCodeAccount();
    sumCvv = 99;
    codeBooking = ReservationTable.randomCodeBooking();
    dowBooking = ReservationTable.randomDow();
  }

  @Override
  public int getSumCvv() {
    return sumCvv;
  }

  @Override
  public String getNameCardholder() {
    return nameCardHolder;
  }

  @Override
  public String getCodeAccount() {
    return String.valueOf(codeAccount);
  }

  @Override
  public int cumeSumCvv(String codeAccount) {
    return 0;
  }

  @Override
  public String getDowBooking() {
    return dowBooking.toString();
  }

  @Override
  public String getCodeBooking() {
    return codeBooking;
  }

  @Override
  public String toString() {
    String fullFormat = DEFAULT_FORMAT_RESERVATIONY + " paid by "
            + DEFAULT_FORMAT_RESERVATIONY;

    return String.format(fullFormat, codeBooking, dowBooking, nameCardHolder, codeAccount, sumCvv);
  }

  private String generateRandomString(String[] elements, int length) {
    String generatedString = "";
    for (int i = 0; i < length; i++) {
      int randomIndex = (int) (Math.random() * elements.length);
      generatedString += elements[randomIndex];
    }
    return generatedString;
  }
}
