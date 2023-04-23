package dev.odes.celerity.common.service;

import java.util.List;

public interface Service<T> {

  List<T> findPage();

  public Iterable<T> findTree(String where, String order);

}
