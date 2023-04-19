package dev.odes.celerity.core.uc.infrastructure.mapper;

import dev.odes.celerity.core.uc.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
  public User findOne(@Param("where") String where, String order);

  public List<User> findMany(@Param("where") String where, String order);
}
