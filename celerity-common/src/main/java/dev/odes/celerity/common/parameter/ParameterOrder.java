package dev.odes.celerity.common.parameter;

import dev.odes.celerity.common.enumeration.OrderEnum;

public class ParameterOrder {
  private String key;
  private OrderEnum order;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }
}
