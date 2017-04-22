package com.greenfox.seed0forever.creditcards;

interface CreditCardy {

  int getSumCvv();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCvv(String codeAccount); // computes codeAccount checksum

  String toString(); //String.format("Name=%s CC#=%s CVV=%d");
}