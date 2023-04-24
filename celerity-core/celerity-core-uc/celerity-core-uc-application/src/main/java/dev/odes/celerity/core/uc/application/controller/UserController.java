package dev.odes.celerity.core.uc.application.controller;

import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.core.uc.domain.model.UserModel;
import dev.odes.celerity.core.uc.domain.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(path = "")
  public ResponseData find() {
    User userModel = this.userService.findOne();
    List<User> users = this.userService.findMany();
    return new ResponseData(users);
  }

  @PostMapping(path = "/many", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findMany(@RequestBody Parameter parameter) {
//    List<User> users = this.userService.findMany();
    return new ResponseData(parameter);
  }

  @GetMapping(path = "/all")
  public ResponseData findAll(@RequestBody Parameter parameter) {
    List<UserModel> userModelList = this.userService.findAll();
    return new ResponseData(userModelList);
  }

  @PostMapping(path = "")
  public ResponseData insertOne(@RequestBody  User user) {
    this.userService.insertOne(user);
    return new ResponseData(user);
  }

  @PutMapping(path = "/{id}")
  public ResponseData updateOne(@PathVariable String id, @RequestBody  User user) {
    this.userService.updateOne(id, user);
    return new ResponseData(id);
  }

  @PatchMapping(path = "/{id}")
  public ResponseData deleteOne(@PathVariable String id, @RequestBody  User user) {
    this.userService.deleteOne(user);
    return new ResponseData(user);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseData removeOne(@PathVariable String id, @RequestBody  User user) {
    this.userService.removeOne(id);
    return new ResponseData(user);
  }

}
