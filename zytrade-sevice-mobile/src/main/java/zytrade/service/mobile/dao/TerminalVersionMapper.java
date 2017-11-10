package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TerminalVersionDO;

public interface TerminalVersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalVersionDO record);

    int insertSelective(TerminalVersionDO record);

    TerminalVersionDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalVersionDO record);

    int updateByPrimaryKey(TerminalVersionDO record);
}