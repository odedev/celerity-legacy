package dev.odes.celerity.core.metadata.application.controller;

import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.metadata.domain.model.ViewModel;
import dev.odes.celerity.core.metadata.domain.service.ViewService;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * package: dev.odes.celerity.core.metadata.app.controller
 * class: ViewController
 * date: 2023/4/19 0:20
 * version: 1.0.0
 * description:
 */
@RestController
@RequestMapping(path = "/metadata/view", produces = MediaType.APPLICATION_JSON_VALUE)
public class ViewController {
  private final ViewService viewService;

  public ViewController(ViewService viewService) {
    this.viewService = viewService;
  }

  @Transactional
  @GetMapping(path = "/{id}")
  public ResponseData findOneById(@PathVariable("id") String id) {
    ViewModel viewModel = this.viewService.findOneById(id);
    return new ResponseData(viewModel);
  }

  @Transactional
  @GetMapping(path = "")
  public ResponseData findMany() {
    List<ViewModel> viewModels = this.viewService.findMany();
    return new ResponseData(viewModels);
  }

}
