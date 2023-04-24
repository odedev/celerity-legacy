package dev.odes.celerity.core.develop.infrastructure.mapper;

import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.persistence.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * package: dev.odes.celerity.core.develop.infrastructure.mapper
 * class: ModuleMapper
 * date: 2023/4/23 20:20
 * version: 1.0.0
 * description:
 */
@Mapper
public interface ModuleMapper extends GenericMapper<Module> {
}
