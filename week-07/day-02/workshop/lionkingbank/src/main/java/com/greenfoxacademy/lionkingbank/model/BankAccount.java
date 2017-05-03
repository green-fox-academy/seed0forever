package com.greenfoxacademy.lionkingbank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {

  private final String name;
  private final String animalType;
  private float balance;
  private boolean isKing = false;
  private boolean isGoodGuy = true;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.animalType = animalType;
    this.balance = Float.parseFloat(balance);
  }

  public BankAccount(String name, String animalType, String balance, boolean isKing) {
    this(name, animalType, balance);
    this.isKing = isKing;
  }

  public BankAccount(String name, String animalType, String balance, boolean isKing,
          boolean isGoodGuy) {
    this(name, animalType, balance, isKing);
    this.isGoodGuy = isGoodGuy;
  }

}
