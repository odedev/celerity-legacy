package dev.odes.celerity.persistence.mysql;

import dev.odes.celerity.common.enumeration.ConditionEnum;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.parameter.ParameterOrder;
import dev.odes.celerity.common.parameter.ParameterProperty;

import java.util.List;

public class ParameterAdapter {
  public static String getWhere(Parameter parameter) {
    StringBuilder where = new StringBuilder();
    List<ParameterProperty> properties = parameter.getProperties();
    ConditionEnum conditionType = parameter.getCondition();

    properties.forEach(parameterProperty -> {
      String key = parameterProperty.getKey();
      Object value = parameterProperty.getValue();
      where.append(key);
      where.append("=");
      where.append(value);
      where.append(conditionType);
    });

    return where.toString();
  }

  public static String getOrder(Parameter parameter) {
    StringBuilder order = new StringBuilder();

    List<ParameterOrder> orders = parameter.getOrders();
    orders.forEach(parameterOrder -> {

    });

    return order.toString();
  }
}
