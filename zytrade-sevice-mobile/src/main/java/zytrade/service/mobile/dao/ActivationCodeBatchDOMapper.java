package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.ActivationCodeBatchDO;

public interface ActivationCodeBatchDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivationCodeBatchDO record);

    int insertSelective(ActivationCodeBatchDO record);

    ActivationCodeBatchDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivationCodeBatchDO record);

    int updateByPrimaryKey(ActivationCodeBatchDO record);
}