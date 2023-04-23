package dev.odes.celerity.core.develop.application.controller;

import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.develop.application.service.DevelopApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package: dev.odes.celerity.core.develop.application.controller
 * class: DevelopApplicationController
 * date: 2023/4/23 20:18
 * version: 1.0.0
 * description:
 */
@RestController
@RequestMapping(path = "/develop")
public class DevelopApplicationController {
  private final DevelopApplicationService developApplicationService;

  public DevelopApplicationController(DevelopApplicationService developApplicationService) {
    this.developApplicationService = developApplicationService;
  }

  @GetMapping(path = "/application")
  public ResponseData getDevelopApplication() {
    return new ResponseData(this.developApplicationService.getDevelopApplication());
  }
}
