package com.greenfox.seed0forever.reservations;

public class Reservation implements Reservationy {

  private static final String[] codeAlphabet = generateCodeAlphabet();

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

  public static String[] getCodeAlphabet() {
    return codeAlphabet;
  }

  @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public String getCodeBooking() {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
