package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.UserTransLimitDO;

public interface UserTransLimitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTransLimitDO record);

    int insertSelective(UserTransLimitDO record);

    UserTransLimitDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTransLimitDO record);

    int updateByPrimaryKey(UserTransLimitDO record);
}