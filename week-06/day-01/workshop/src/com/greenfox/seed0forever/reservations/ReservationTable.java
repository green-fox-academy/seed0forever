package com.greenfox.seed0forever.reservations;

import java.util.ArrayList;
import java.util.List;

public class ReservationTable {

  private static final String[] CODE_ALPHABET = generateCodeAlphabet();
  private static final int LENGTH_CODE_BOOKING = 8;

  private List<Reservation> contents;

  public ReservationTable() {
    contents = new ArrayList<>();
  }

  public static String[] getCodeAlphabet() {
    return CODE_ALPHABET;
  }

  private static String[] generateCodeAlphabet() {
    String[] codeAlphabet = new String[10 + (91 - 65)];

    for (int arrayIndex = 0; arrayIndex < codeAlphabet.length; arrayIndex++) {
      if (arrayIndex < 10) {
        codeAlphabet[arrayIndex] = String.valueOf(arrayIndex);
      } else {
        codeAlphabet[arrayIndex] = Character.toString((char) ('A' + arrayIndex - 10));
      }
    }
    return codeAlphabet;
  }

  public void add() {
    contents.add(new Reservation(randomCodeBooking(), randomDowBooking()));
  }

  @Override
  public String toString() {
    String reservationList = "";
    for (int i = 0; i < contents.size(); i++) {
      Reservation reservation = contents.get(i);
      reservationList += reservation;
      reservationList += (i != contents.size() - 1) ? "\n" : "";
    }
    return reservationList;
  }

  private String randomDowBooking() {
    return generateRandomString(DayOfTheWeek.values());
  }

  private String randomCodeBooking() {
    return generateRandomString(CODE_ALPHABET, LENGTH_CODE_BOOKING);
  }

  private String generateRandomString(String[] elements, int length) {
    String generatedString = "";
    for (int i = 0; i < length; i++) {
      int randomIndex = (int) (Math.random() * elements.length);
      generatedString += elements[randomIndex];
    }
    return generatedString;
  }

  private String generateRandomString(DayOfTheWeek[] dow) {
    int randomIndex = (int) (Math.random() * dow.length);
    return dow[randomIndex].toString();
  }

  public void add(int amount) {
    for (int i = 0; i < amount; i++) {
      add();
    }
  }
}
