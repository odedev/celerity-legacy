package dev.odes.celerity.common.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractEntity implements Entity, Serializable {
  private static final long serial = 1L;

  private Date createdAt;
  private Date updatedAt;
  private Integer updatedCount;
  private Date deletedAt;

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getUpdatedCount() {
    return updatedCount;
  }

  public void setUpdatedCount(Integer updatedCount) {
    this.updatedCount = updatedCount;
  }

  public Date getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }
}
