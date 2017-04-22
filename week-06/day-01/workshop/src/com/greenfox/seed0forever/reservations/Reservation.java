package com.greenfox.seed0forever.reservations;

public class Reservation implements Reservationy {


  private String dowBooking;
  private String codeBooking;

  public Reservation(String codeBooking, String dowBooking) {
    this.codeBooking = codeBooking;
    this.dowBooking = dowBooking;
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
    return String.format("Booking# %s for %s", codeBooking, dowBooking);
  }
}
