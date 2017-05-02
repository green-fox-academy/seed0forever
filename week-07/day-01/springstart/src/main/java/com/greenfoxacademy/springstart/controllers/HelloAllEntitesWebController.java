package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.entities.SayHelloEntity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllEntitesWebController {

  private final static String[] HELLOS = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


  @RequestMapping("/web/greeting-all-entities")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name,
          Model model) {
    model.addAttribute("name", name);
    List<String> shuffledHellos = Arrays.asList(HELLOS);
    Collections.shuffle(shuffledHellos);

    SayHelloEntity[] helloEntities = fillWithHelloEntities(shuffledHellos);


    model.addAttribute("helloEntities", helloEntities);

    // String[] randomHelloColors = fillWithRandomColors(HELLOS.length);
    // model.addAttribute("color", randomHelloColors);
    //
    // String[] randomFontSizes = fillWithRandomFontSizes(HELLOS.length);
    // model.addAttribute("fontSize", randomFontSizes);

    return "hello-all-entities";
  }

  private SayHelloEntity[] fillWithHelloEntities(List<String> shuffledHellos) {
    SayHelloEntity[] helloEntityArray = new SayHelloEntity[shuffledHellos.size()];

    for (int i = 0; i < helloEntityArray.length; i++) {
      helloEntityArray[i] = new SayHelloEntity(
              shuffledHellos.get(i),
              generateRandomColorRgb(),
              generateRandomFontSize());
    }
    return helloEntityArray;
  }

  private String[] fillWithRandomFontSizes(int numberOfFontSizes) {
    String[] fontSizeArray = new String[numberOfFontSizes];
    for (int i = 0; i < numberOfFontSizes; i++) {
      fontSizeArray[i] = generateRandomFontSize();
    }
    return fontSizeArray;
  }

  private String generateRandomFontSize() {
    String fontSizeFormat = "%dpx";
    int randomFontSize = 12 + (int) (Math.random() * 15);
    return String.format(fontSizeFormat, randomFontSize);
  }

  private String[] fillWithRandomColors(int numberOfColors) {
    String[] colorArray = new String[numberOfColors];
    for (int i = 0; i < numberOfColors; i++) {
      colorArray[i] = generateRandomColorRgb();
    }
    return colorArray;
  }

  private String generateRandomColorRgb() {
    String rgbFormat = "rgb(%d,%d,%d)";
    int red = (int) (Math.random() * 200);
    int green = (int) (Math.random() * 200);
    int blue = (int) (Math.random() * 200);
    return String.format(rgbFormat, red, green, blue);
  }

}
