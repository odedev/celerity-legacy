package dev.odes.celerity.core.user.domain.persistence;

import dev.odes.celerity.common.persistence.Persistence;
import dev.odes.celerity.core.user.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPersistence {
  public User findOne(@Param("where") String where, String order);

  public List<User> findMany(@Param("where") String where, String order);
}
