package com.greenfox.seed0forever;

import com.greenfox.seed0forever.reservations.*;

public class ReservationApp {

  public static void main(String[] args) {

    for (int i = 0; i < Reservation.getCodeAlphabet().length; i++) {
      System.out.printf(Reservation.getCodeAlphabet()[i]);
    }
  }
}
