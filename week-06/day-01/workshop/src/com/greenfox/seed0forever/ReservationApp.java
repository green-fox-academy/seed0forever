package com.greenfox.seed0forever;

import com.greenfox.seed0forever.reservations.ReservationTable;

public class ReservationApp {

  public static void main(String[] args) {

    ReservationTable currentReservations = new ReservationTable();

    currentReservations.add(10);
    System.out.println(currentReservations);
  }
}
