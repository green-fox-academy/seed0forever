package com.greenfoxacademy.lionkingbank.controller;

import com.greenfoxacademy.lionkingbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

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

}
