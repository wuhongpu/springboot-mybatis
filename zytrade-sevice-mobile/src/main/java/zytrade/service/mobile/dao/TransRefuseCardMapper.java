package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TransRefuseCardDO;

public interface TransRefuseCardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TransRefuseCardDO record);

    int insertSelective(TransRefuseCardDO record);

    TransRefuseCardDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TransRefuseCardDO record);

    int updateByPrimaryKey(TransRefuseCardDO record);
}