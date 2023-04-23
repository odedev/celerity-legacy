package dev.odes.celerity.core.system.domain.repository;


import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.system.domain.entity.Setting;
import dev.odes.celerity.core.system.domain.model.SettingModelBase;
import dev.odes.celerity.core.system.domain.persistence.SettingPersistence;
import org.springframework.stereotype.Repository;


@Repository
public class SettingRepository extends AbstractRepository<Setting, SettingModelBase, SettingPersistence> {
  private final SettingPersistence settingPersistence;

  public SettingRepository(SettingPersistence settingPersistence) {
    super(settingPersistence);
    this.settingPersistence = settingPersistence;
  }

  @Override
  public SettingModelBase transform(Setting setting) {
    SettingModelBase settingModel = new SettingModelBase();
    settingModel.fromEntity(setting);
    return settingModel;
  }

  @Override
  public Setting transform(SettingModelBase settingModel) {
    Setting setting = settingModel.toEntity();
    return setting;
  }

  @Override
  public void beforeInsert(SettingModelBase settingModel) {
    super.beforeInsert(settingModel);
    settingModel.setDefaultValue();
  }

  @Override
  public Iterable<SettingModelBase> findMany(String where, String order) {
    return null;
  }

  @Override
  public SettingModelBase findOneById(String id) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> findManyById(Iterable<String> ids) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> findAll(String order) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> findPage(String order, Integer pageSize) {
    return null;
  }

  @Override
  public SettingModelBase insertOne(SettingModelBase settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> insertMany(Iterable<SettingModelBase> list) {
    return null;
  }

  @Override
  public SettingModelBase updateOne(SettingModelBase settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> updateMany(Iterable<SettingModelBase> list) {
    return null;
  }

  @Override
  public SettingModelBase deleteOne(SettingModelBase settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> deleteMany(Iterable<SettingModelBase> list) {
    return null;
  }

  @Override
  public SettingModelBase removeOne(SettingModelBase settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModelBase> removeMany(Iterable<SettingModelBase> list) {
    return null;
  }

  @Override
  public Integer count() {
    return null;
  }

  @Override
  public Boolean exist() {
    return null;
  }


}
