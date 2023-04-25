package dev.odes.celerity.core.develop.infrastructure.mapper;

import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.persistence.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewMapper extends GenericMapper<View> {
}
