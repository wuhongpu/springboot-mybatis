package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.IDblackListDO;

public interface IDblackListMapper {
    int deleteByPrimaryKey(String idcard);

    int insert(IDblackListDO record);

    int insertSelective(IDblackListDO record);

    IDblackListDO selectByPrimaryKey(String idcard);

    int updateByPrimaryKeySelective(IDblackListDO record);

    int updateByPrimaryKey(IDblackListDO record);
}