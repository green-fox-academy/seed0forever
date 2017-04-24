package com.greenfox.seed0forever.creditcards;

public interface CreditCardy {

  String DEFAULT_FORMAT_CREDITCARDY = "Name=%s CC#=%s CVV=%d";
  String DEFAULT_NAME_FORMAT = "ABC%d";
  int CODE_ACCOUNT_LENGTH = 16;

  int getSumCvv();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCvv(long codeAccount); // computes codeAccount checksum

  String toString(); //String.format("Name=%s CC#=%s CVV=%d");
}