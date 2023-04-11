package dev.odes.celerity.common.service;

import java.util.List;

public interface Service<T> {

  List<T> findPage();

}
