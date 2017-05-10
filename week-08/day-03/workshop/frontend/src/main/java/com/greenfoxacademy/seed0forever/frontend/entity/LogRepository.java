package com.greenfoxacademy.seed0forever.frontend.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface LogRepository extends CrudRepository<Log, Long> {

}
