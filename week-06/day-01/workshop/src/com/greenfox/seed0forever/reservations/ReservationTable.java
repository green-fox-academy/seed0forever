package com.greenfox.seed0forever.reservations;

import java.util.ArrayList;
import java.util.List;

public class ReservationTable {

  public static final String[] CODE_ALPHABET = generateCodeAlphabet();
  public static final int LENGTH_CODE_BOOKING = 8;

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

  public static String randomCodeBooking() {
    return randomDow(CODE_ALPHABET, LENGTH_CODE_BOOKING);
  }

  private static String randomDow(String[] elements, int length) {
    String generatedString = "";
    for (int i = 0; i < length; i++) {
      int randomIndex = (int) (Math.random() * elements.length);
      generatedString += elements[randomIndex];
    }
    return generatedString;
  }

  public static DayOfTheWeek randomDow() {
    int randomIndex = (int) (Math.random() * DayOfTheWeek.values().length);
    return DayOfTheWeek.values()[randomIndex];
  }

  public void add() {
    contents.add(new Reservation(randomCodeBooking(), randomDow()));
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

  public void add(int amount) {
    for (int i = 0; i < amount; i++) {
      add();
    }
  }
}
