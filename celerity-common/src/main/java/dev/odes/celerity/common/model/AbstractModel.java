package dev.odes.celerity.common.model;

import dev.odes.celerity.common.entity.AbstractEntity;

import java.io.Serializable;

public abstract class AbstractModel<E extends AbstractEntity> implements Model<E>, Serializable {
  private static final long serial = 1L;

}
