package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.CardPDO;

public interface CardPMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CardPDO record);

    int insertSelective(CardPDO record);

    CardPDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CardPDO record);

    int updateByPrimaryKey(CardPDO record);
}