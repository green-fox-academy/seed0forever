package com.greenfoxacademy.lionkingbank.model;

import lombok.Getter;

@Getter
public class BankAccount {

  private final String name;
  private final String animalType;
  private float balance;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.animalType = animalType;
    this.balance = Float.parseFloat(balance);
  }

}
