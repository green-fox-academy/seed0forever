package com.greenfox.seed0forever.creditcards;

public class CreditCard implements CreditCardy {

  private static int counter = 0;

  private int sumCvv;
  private long codeAccount;
  private String nameCardHolder;

  public CreditCard() {
    nameCardHolder = String.format(DEFAULT_NAME_FORMAT, counter++);
    codeAccount = randomCreditCardCodeAccount();
    sumCvv = 99;
  }

  public static long randomCreditCardCodeAccount() {
    return generateRandomLong(CODE_ACCOUNT_LENGTH);
  }

  private static long generateRandomLong(int length) {
    long min = (long) Math.pow(10, length - 1);
    long maxExclusive = (long) Math.pow(10, length);
    return (long) min + (long) (Math.random() * (maxExclusive - min));
  }

  @Override
  public int getSumCvv() {
    return sumCvv;
  }

  @Override
  public String getNameCardholder() {
    return nameCardHolder;
  }

  @Override
  public String getCodeAccount() {
    return String.valueOf(codeAccount);
  }

  @Override
  public int cumeSumCvv(String codeAccount) {
    return 0;
  }

  @Override
  public String toString() {
    return String.format(DEFAULT_FORMAT_CREDITCARDY, nameCardHolder, codeAccount, sumCvv);
  }
}
