package dev.odes.celerity.common.entity;

import java.util.Date;

public abstract class AbstractEntity implements Entity {

  private Date createdAt;
  private Date updatedAt;
  private Integer updatedCount;
  private Date deletedAt;

  public AbstractEntity() {

  }

  @Override
  public abstract String getName();

}
