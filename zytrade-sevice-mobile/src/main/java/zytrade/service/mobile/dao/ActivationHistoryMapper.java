package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.ActivationHistoryDO;

public interface ActivationHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivationHistoryDO record);

    int insertSelective(ActivationHistoryDO record);

    ActivationHistoryDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivationHistoryDO record);

    int updateByPrimaryKey(ActivationHistoryDO record);
}