package dev.odes.celerity.core.metadata.infrastructure.mapper;

import dev.odes.celerity.core.metadata.domain.entity.View;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * package: dev.odes.celerity.core.metadata.persistence.mapper
 * class: ViewMapper
 * date: 2023/4/18 23:35
 * version: 1.0.0
 * description:
 */
@Mapper
public interface ViewsMapper {
  public View findOne(@Param("where") String where, String order);

  public List<View> findMany(@Param("where") String where, String order);
}
