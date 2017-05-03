package com.greenfoxacademy.lionkingbank.controller;

import com.greenfoxacademy.lionkingbank.model.BankAccount;
import com.greenfoxacademy.lionkingbank.model.IndexEntry;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  List<BankAccount> bankAccountsExercise10;

  public BankAccountController() {
    bankAccountsExercise10 = new ArrayList<>();
    bankAccountsExercise10.add(new BankAccount("Mufasa", "800", "lion", true));
    bankAccountsExercise10.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountsExercise10.add(new BankAccount("Timon", "200", "meerkat"));
    bankAccountsExercise10.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountsExercise10.add(new BankAccount("Scar", "100", "lion", true, false));
  }

  @RequestMapping("/exercise3")
  public String showAccountInfo(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    model.addAttribute(bankAccount);
    return "bank-account-info";
  }

  @RequestMapping("/exercise4")
  public String sanitizeInput(Model model) {
    String submittedText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    model.addAttribute("submittedText", submittedText);
    return "input-sanitization";
  }

  @RequestMapping("/exercise5")
  public String listBankAccounts(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion"));

    model.addAttribute(bankAccountList);

    return "bank-account-list";
  }

  @RequestMapping("/exercise6")
  public String listBankAccountsAndStats(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion"));

    model.addAttribute(bankAccountList);

    return "bank-account-list-and-stat";
  }

  @RequestMapping("/exercise7")
  public String listBankAccountsAndStatsAndKing(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion", true));

    model.addAttribute(bankAccountList);

    return "bank-account-list-and-stat-and-king";
  }

  @RequestMapping("/exercise8")
  public String listBankAccountsAndStatsKingBadGuy(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Mufasa", "10000000", "lion", true));
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "1000", "lion", true, false));

    model.addAttribute(bankAccountList);

    return "bank-account-list-and-stat-and-king-badguy";
  }

  @RequestMapping("/exercise9")
  public String listBankAccountsAndStatsKingBadGuySwitch(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Mufasa", "10000000", "lion", true));
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "1000", "lion", true, false));

    model.addAttribute(bankAccountList);

    return "bank-account-list-and-stat-and-king-badguy-switch";
  }

  @RequestMapping("/exercise10")
  public String bankAccountSubmit(Model model) {
    model.addAttribute(bankAccountsExercise10);
    model.addAttribute("elementIndexToIncreaseBalance", new IndexEntry());

    return "bank-account-submit";
  }

  @RequestMapping(value = "/exercise10/increase")
  public String bankAccountIncreaseBalance(IndexEntry elementIndexToIncreaseBalance) {
    BankAccount bankAccountToChange = bankAccountsExercise10
            .get(elementIndexToIncreaseBalance.getIndex());

    float prevoiusBalance = bankAccountToChange.getBalance();

    bankAccountToChange.setBalance(prevoiusBalance + 10f);

    return "redirect:/exercise10";
  }

}
