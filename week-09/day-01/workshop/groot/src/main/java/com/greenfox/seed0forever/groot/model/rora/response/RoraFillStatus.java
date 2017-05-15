package com.greenfox.seed0forever.groot.model.rora.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class RoraFillStatus {

  private String received;
  private long amount;
  private String shipstatus;
  private boolean ready;

}
