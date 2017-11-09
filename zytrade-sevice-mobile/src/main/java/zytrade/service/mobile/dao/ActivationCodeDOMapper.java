package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.ActivationCodeDO;

public interface ActivationCodeDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivationCodeDO record);

    int insertSelective(ActivationCodeDO record);

    ActivationCodeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivationCodeDO record);

    int updateByPrimaryKey(ActivationCodeDO record);
}