package com.greenfox.seed0forever;

import com.greenfox.seed0forever.creditcards.CreditCard;
import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {

  public static void main(String[] args) {
    List<CreditCard> creditCardList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      creditCardList.add(new CreditCard());
    }

    for (CreditCard creditCard : creditCardList) {
      System.out.println(creditCard);
    }
  }

}
