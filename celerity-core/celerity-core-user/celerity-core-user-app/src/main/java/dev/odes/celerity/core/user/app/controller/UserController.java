package dev.odes.celerity.core.user.app.controller;

import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.user.domain.entity.User;
import dev.odes.celerity.core.user.domain.model.UserModel;
import dev.odes.celerity.core.user.domain.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "dev.odes.celerity.core.user.app.controller.UserController")
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(path = "/id")
  public ResponseData find() {
    User userModel = this.userService.findOne();
    List<User> users = this.userService.findMany();
    List<UserModel> userModelList = this.userService.find();
    return new ResponseData(userModelList);
  }

}
