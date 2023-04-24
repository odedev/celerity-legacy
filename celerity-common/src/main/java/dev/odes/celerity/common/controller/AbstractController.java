package dev.odes.celerity.common.controller;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.persistence.Persistence;
import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.common.repository.Repository;
import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.common.service.AbstractService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, M extends AbstractModel<E>, P extends Persistence<E>, R extends AbstractRepository<E, M, P>, S extends AbstractService<E, M, R>> implements Controller<E, M> {
  private final S service;

  public AbstractController(S service) {
    this.service = service;
  }

  @Override
  @PostMapping(path = "/find", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findMany(@RequestBody Parameter parameter) {
    List<M> many = this.service.findMany(parameter);
    return new ResponseData(many);
  }

  @Override
  @PostMapping(path = "/find/one", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findOne(@RequestBody Parameter parameter) {
    M one = this.service.findOne(parameter);
    return new ResponseData(one);
  }

  @Override
  @PostMapping(path = "/find/page", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findPage(@RequestBody Parameter parameter) {
    List<M> page = this.service.findPage(parameter);
    return new ResponseData(page);
  }

  @Override
  @PostMapping(path = "/find/tree", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findTree(@RequestBody Parameter parameter) {
    List<M> tree = this.service.findTree(parameter);
    return new ResponseData(tree);
  }

  @Override
  @PostMapping(path = "/find/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findAll(@RequestBody Parameter parameter) {
    List<M> all = this.service.findAll(parameter);
    return new ResponseData(all);
  }

  @Override
  @PostMapping(path = "/find/id", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findManyById(@RequestBody List<String> ids) {
    List<M> many = this.service.findManyById(ids);
    return new ResponseData(many);
  }

  @Override
  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData findOneById(@PathVariable String id) {
    M one = this.service.findOneById(id);
    return new ResponseData(one);
  }

  @Override
  @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData insertOne(@RequestBody M m) {
    M one = this.service.insertOne(m);
    return new ResponseData(one);
  }

  @Override
  @PostMapping(path = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData insertMany(@RequestBody List<M> list) {
    List<M> many = this.service.insertMany(list);
    return new ResponseData(many);
  }

  @Override
  @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData updateOne(@PathVariable String id, @RequestBody M m) {
    M one = this.service.updateOne(m);
    return new ResponseData(one);
  }

  @Override
  @PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData updateMany(@RequestBody List<M> list) {
    List<M> many = this.service.updateMany(list);
    return new ResponseData(many);
  }

  @Override
  @PatchMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData deleteOne(@PathVariable String id, @RequestBody M m) {
    M one = this.service.deleteOne(m);
    return new ResponseData(one);
  }

  @Override
  @PatchMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData deleteMany(@RequestBody List<M> list) {
    List<M> many = this.service.deleteMany(list);
    return new ResponseData(many);
  }

  @Override
  @DeleteMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData removeOne(@PathVariable String id, @RequestBody M m) {
    M one = this.service.removeOne(m);
    return new ResponseData(one);
  }

  @Override
  @DeleteMapping(path = "/remove", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseData removeMany(@RequestBody List<M> list) {
    List<M> many = this.service.removeMany(list);
    return new ResponseData(many);
  }

  @Override
  @PostMapping(path = "/count", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Integer count(@RequestBody Parameter parameter) {
    return null;
  }

  @Override
  @PostMapping(path = "/exist", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Boolean exist(@RequestBody Parameter parameter) {
    return null;
  }
}
