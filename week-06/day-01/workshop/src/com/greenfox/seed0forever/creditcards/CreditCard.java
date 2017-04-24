package com.greenfox.seed0forever.creditcards;

public class CreditCard implements CreditCardy {

  private static int counter = 0;

  private int sumCvv;
  private long codeAccount;
  private String nameCardHolder;

  public CreditCard() {
    nameCardHolder = String.format(DEFAULT_NAME_FORMAT, counter++);
    codeAccount = randomCreditCardCodeAccount();
    sumCvv = cumeSumCvv(codeAccount);
  }

  public static long randomCreditCardCodeAccount() {
    return generateRandomLong(CODE_ACCOUNT_LENGTH);
  }

  private static long generateRandomLong(int length) {
    long min = (long) Math.pow(10, length - 1);
    long maxExclusive = (long) Math.pow(10, length);
    return min + (long) (Math.random() * (maxExclusive - min));
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
  public int cumeSumCvv(long codeAccount) {
    int sumCvv = 0;
    String codeString = String.valueOf(codeAccount);

    for (int i = 0; i < codeString.length(); i++) {
      sumCvv += Integer.parseInt(String.valueOf(codeString.charAt(i)));
    }
    return sumCvv;
  }

  @Override
  public String toString() {
    return String.format(DEFAULT_FORMAT_CREDITCARDY, nameCardHolder, codeAccount, sumCvv);
  }
}
