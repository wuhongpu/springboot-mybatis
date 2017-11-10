package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.UserShopDO;

public interface UserShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserShopDO record);

    int insertSelective(UserShopDO record);

    UserShopDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserShopDO record);

    int updateByPrimaryKey(UserShopDO record);
}