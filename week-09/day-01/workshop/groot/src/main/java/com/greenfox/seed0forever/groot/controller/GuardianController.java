package com.greenfox.seed0forever.groot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GuardianController {

    private final static String GROOT_ANSWER = "I am Groot!";

    @GetMapping("/groot")
    public Map<String, String> respondGroot(@RequestParam(required = false) String message) {
        Map<String, String> response = new HashMap<>();

        if (message != null && message != "") {
            response.put("received", message);
            response.put("translated", GROOT_ANSWER);
        } else {
            response.put("error", GROOT_ANSWER);
        }

        return response;
    }
}
