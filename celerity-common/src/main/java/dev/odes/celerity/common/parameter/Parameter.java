package dev.odes.celerity.common.parameter;

import dev.odes.celerity.common.enumeration.ConditionEnum;
import dev.odes.celerity.common.enumeration.OrderEnum;

import java.io.Serializable;
import java.util.List;

public class Parameter implements Serializable {
  private static final long serial = 1L;

  private ConditionEnum condition;
  private Integer pageNumber;
  private Integer pageSize;
  private String orderKey;
  private OrderEnum order;
  private List<ParameterProperty> properties;
  private List<ParameterOrder> orders;

  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getOrderKey() {
    return orderKey;
  }

  public void setOrderKey(String orderKey) {
    this.orderKey = orderKey;
  }

  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public List<ParameterProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<ParameterProperty> properties) {
    this.properties = properties;
  }

  public List<ParameterOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<ParameterOrder> orders) {
    this.orders = orders;
  }
}
