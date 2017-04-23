package com.greenfox.seed0forever;

import com.greenfox.seed0forever.creditcardreservations.CreditCardReservation;
import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {

  public static void main(String[] args) {
    List<CreditCardReservation> listCcReservations = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      listCcReservations.add(new CreditCardReservation());
    }

    for (CreditCardReservation ccReservation : listCcReservations) {
      System.out.println(ccReservation);
    }
  }
}
