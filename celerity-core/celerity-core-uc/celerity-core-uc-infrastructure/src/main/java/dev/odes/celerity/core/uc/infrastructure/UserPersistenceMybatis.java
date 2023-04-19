package dev.odes.celerity.core.uc.infrastructure;

import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.core.uc.domain.persistence.UserPersistence;
import dev.odes.celerity.core.uc.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * package: dev.odes.celerity.core.user.infrastructure.mapper
 * class: UserPersistence
 * date: 2023/4/19 20:06
 * version: 1.0.0
 * description:
 */
@Repository
public class UserPersistenceMybatis implements UserPersistence {
  private final UserMapper userMapper;

  public UserPersistenceMybatis(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public User findOne(Object where, Object order) {
    return this.userMapper.findOne(where.toString(), order.toString());
  }

  @Override
  public List<User> findMany(Object where, Object order) {
    return this.userMapper.findMany(where.toString(), order.toString());
  }
}
