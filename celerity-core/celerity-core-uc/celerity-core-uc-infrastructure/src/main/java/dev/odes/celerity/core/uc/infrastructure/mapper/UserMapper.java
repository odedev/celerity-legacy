package dev.odes.celerity.core.uc.infrastructure.mapper;

import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.persistence.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper extends GenericMapper<User> {

}
