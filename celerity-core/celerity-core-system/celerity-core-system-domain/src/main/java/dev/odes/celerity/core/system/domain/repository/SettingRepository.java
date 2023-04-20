package dev.odes.celerity.core.system.domain.repository;


import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.system.domain.entity.Setting;
import dev.odes.celerity.core.system.domain.model.SettingModel;
import dev.odes.celerity.core.system.domain.persistence.SettingPersistence;
import org.springframework.stereotype.Repository;


@Repository
public class SettingRepository extends AbstractRepository<Setting, SettingModel, SettingPersistence> {
  private final SettingPersistence settingPersistence;

  public SettingRepository(SettingPersistence settingPersistence) {
    super(settingPersistence);
    this.settingPersistence = settingPersistence;
  }

  @Override
  public SettingModel transform(Setting setting) {
    SettingModel settingModel = new SettingModel();
    settingModel.fromEntity(setting);
    return settingModel;
  }

  @Override
  public Setting transform(SettingModel settingModel) {
    Setting setting = settingModel.toEntity();
    return setting;
  }

  @Override
  public void beforeInsert(SettingModel settingModel) {
    super.beforeInsert(settingModel);
    settingModel.setDefaultValue();
  }

  @Override
  public Iterable<SettingModel> findMany(String where, String order) {
    return null;
  }

  @Override
  public SettingModel findOneById(String id) {
    return null;
  }

  @Override
  public Iterable<SettingModel> findManyById(Iterable<String> ids) {
    return null;
  }

  @Override
  public Iterable<SettingModel> findAll(String order) {
    return null;
  }

  @Override
  public Iterable<SettingModel> findPage(String order, Integer pageSize) {
    return null;
  }

  @Override
  public SettingModel insertOne(SettingModel settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModel> insertMany(Iterable<SettingModel> list) {
    return null;
  }

  @Override
  public SettingModel updateOne(SettingModel settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModel> updateMany(Iterable<SettingModel> list) {
    return null;
  }

  @Override
  public SettingModel deleteOne(SettingModel settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModel> deleteMany(Iterable<SettingModel> list) {
    return null;
  }

  @Override
  public SettingModel removeOne(SettingModel settingModel) {
    return null;
  }

  @Override
  public Iterable<SettingModel> removeMany(Iterable<SettingModel> list) {
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

  @Override
  public Integer findIndex() {
    return null;
  }
}
