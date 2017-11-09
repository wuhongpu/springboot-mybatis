package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.UserAddedDO;

public interface UserAddedDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAddedDO record);

    int insertSelective(UserAddedDO record);

    UserAddedDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAddedDO record);

    int updateByPrimaryKey(UserAddedDO record);
}