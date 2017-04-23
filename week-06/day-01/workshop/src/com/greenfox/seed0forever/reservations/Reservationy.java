package com.greenfox.seed0forever.reservations;

public interface Reservationy {

  String DEFAULT_FORMAT_RESERVATIONY = "Booking# %s for %s";

  String getDowBooking();

  String getCodeBooking();

  String toString(); //format("Booking# %s for %s");
}