package com.vdong.rms.repository.dao;


import com.vdong.rms.entity.domain.UserDO;
import org.lamb.framework.core.supper.LambDORepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @program: decisionsupportsystem
 * @description: 用户表DAO
 * @author: Mr.WangGang
 * @create: 2018-08-24 14:32
 **/
public interface UserDORepository extends LambDORepository<UserDO> {
    @Query(nativeQuery = true,value =
            "select " +
                    "users.* " +
                    "FROM user users " +
                    "where users.system_id = ?1"
    )
    public Optional<List<UserDO>> findBySystemId(Integer systemId);
}
