package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.TerminalPrivilegesDO;

public interface TerminalPrivilegesDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalPrivilegesDO record);

    int insertSelective(TerminalPrivilegesDO record);

    TerminalPrivilegesDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalPrivilegesDO record);

    int updateByPrimaryKey(TerminalPrivilegesDO record);
}