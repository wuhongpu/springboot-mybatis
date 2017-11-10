package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.DPIDO;

public interface DPIMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DPIDO record);

    int insertSelective(DPIDO record);

    DPIDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DPIDO record);

    int updateByPrimaryKey(DPIDO record);
}