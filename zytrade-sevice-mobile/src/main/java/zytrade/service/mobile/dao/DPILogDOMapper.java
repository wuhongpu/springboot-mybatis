package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.DPILogDO;

public interface DPILogDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DPILogDO record);

    int insertSelective(DPILogDO record);

    DPILogDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DPILogDO record);

    int updateByPrimaryKey(DPILogDO record);
}