package dev.odes.celerity.core.user.base.controller;

import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.user.base.model.UserModel;
import dev.odes.celerity.core.user.base.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(path = "/id")
  public ResponseData find() {
    UserModel userModel = this.userService.findOneById();
    return new ResponseData(userModel);
  }

}
