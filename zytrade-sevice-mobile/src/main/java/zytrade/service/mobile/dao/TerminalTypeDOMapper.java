package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TerminalTypeDO;

public interface TerminalTypeDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalTypeDO record);

    int insertSelective(TerminalTypeDO record);

    TerminalTypeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalTypeDO record);

    int updateByPrimaryKey(TerminalTypeDO record);
}