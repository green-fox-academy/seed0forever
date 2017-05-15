package com.greenfox.seed0forever.groot.controller;

import com.greenfox.seed0forever.groot.GrootApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void respondGroot_WithMessage() throws Exception {
    mockMvc.perform(get("/groot").param("message", "any message"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is("any message")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void respondGroot_WithoutMessage() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

}