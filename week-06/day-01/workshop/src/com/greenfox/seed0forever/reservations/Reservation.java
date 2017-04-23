package com.greenfox.seed0forever.reservations;

public class Reservation implements Reservationy {

  private DayOfTheWeek dowBooking;
  private String codeBooking;

  public Reservation(String codeBooking, DayOfTheWeek dowBooking) {
    this.codeBooking = codeBooking;
    this.dowBooking = dowBooking;
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
    return String.format(DEFAULT_FORMAT_RESERVATIONY, codeBooking, dowBooking);
  }
}
