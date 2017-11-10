package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.ActivationCodeStatisticDO;

public interface ActivationCodeStatisticMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivationCodeStatisticDO record);

    int insertSelective(ActivationCodeStatisticDO record);

    ActivationCodeStatisticDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivationCodeStatisticDO record);

    int updateByPrimaryKey(ActivationCodeStatisticDO record);
}