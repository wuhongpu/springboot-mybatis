package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TerminalErrorLogDO;

public interface TerminalErrorLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalErrorLogDO record);

    int insertSelective(TerminalErrorLogDO record);

    TerminalErrorLogDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalErrorLogDO record);

    int updateByPrimaryKey(TerminalErrorLogDO record);
}