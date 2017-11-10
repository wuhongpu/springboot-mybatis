package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TerminalRoleDO;

public interface TerminalRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalRoleDO record);

    int insertSelective(TerminalRoleDO record);

    TerminalRoleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalRoleDO record);

    int updateByPrimaryKey(TerminalRoleDO record);
}