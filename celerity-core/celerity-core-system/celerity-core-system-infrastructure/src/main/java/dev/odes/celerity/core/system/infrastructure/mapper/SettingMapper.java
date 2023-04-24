package dev.odes.celerity.core.system.infrastructure.mapper;

import dev.odes.celerity.core.system.domain.entity.Setting;
import dev.odes.celerity.persistence.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SettingMapper extends GenericMapper<Setting> {

}
