package dev.odes.celerity.common.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractEntity implements Entity, Serializable {
  private static final long serial = 1L;

  private Date createdAt;
  private Date updatedAt;
  private Integer updatedCount;
  private Date deletedAt;

}
