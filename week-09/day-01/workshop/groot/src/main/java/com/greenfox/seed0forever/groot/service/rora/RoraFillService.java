package com.greenfox.seed0forever.groot.service.rora;

import com.greenfox.seed0forever.groot.model.rora.RoraShip;
import com.greenfox.seed0forever.groot.model.rora.response.RoraFillStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoraFillService {

  @Autowired
  RoraFillStatus roraFillStatus;

  public RoraFillStatus fillShip(RoraShip roraShip, String caliber, long amount) {
    roraShip.fillWith(caliber, amount);
    roraFillStatus.setReceived(caliber);
    roraFillStatus.setAmount(amount);
    roraFillStatus.setShipstatus(roraShip.getShipstatus());
    roraFillStatus.setReady(roraShip.isReady());
    return roraFillStatus;
  }
}
