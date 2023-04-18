package dev.odes.celerity.core.user.domain.persistence.mapper;

import dev.odes.celerity.core.user.domain.entity.User;
import dev.odes.celerity.core.user.domain.persistence.UserPersistence;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserPersistenceMapper extends UserPersistence {
}
