package com.greenfox.seed0forever.groot.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

import com.greenfox.seed0forever.groot.GrootApplication;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RoraControllerTest {

  private static final MediaType EXPECTED_CONTENT_TYPE = new MediaType(
          MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testA_listCargoStatus() throws Exception {
    mockMvc.perform(get("/rocket"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(EXPECTED_CONTENT_TYPE))
            .andExpect(jsonPath("$.caliber25", is(0)))
            .andExpect(jsonPath("$.caliber30", is(0)))
            .andExpect(jsonPath("$.caliber50", is(0)))
            .andExpect(jsonPath("$.shipstatus", is("empty")))
            .andExpect(jsonPath("$.ready", is(false)))
            .andDo(print());
  }

  @Test
  public void testB_fillShipAndShowStatus() throws Exception {
    mockMvc.perform(get("/rocket/fill")
            .param("caliber", ".25")
            .param("amount", "5000"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(EXPECTED_CONTENT_TYPE))
            .andExpect(jsonPath("$.received", is(".25")))
            .andExpect(jsonPath("$.amount", is(5000)))
            .andExpect(jsonPath("$.shipstatus", is("40%")))
            .andExpect(jsonPath("$.ready", is(false)))
            .andDo(print());
  }

}