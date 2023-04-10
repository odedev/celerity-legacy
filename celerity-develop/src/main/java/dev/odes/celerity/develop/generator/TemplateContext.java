package dev.odes.celerity.develop.generator;

import dev.odes.celerity.develop.entity.Entity;
import dev.odes.celerity.develop.entity.EntityField;

import java.util.List;

public class TemplateContext {
  private Entity entity;
  private List<EntityField> entityFields;

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public List<EntityField> getEntityFields() {
    return entityFields;
  }

  public void setEntityFields(List<EntityField> entityFields) {
    this.entityFields = entityFields;
  }
}
