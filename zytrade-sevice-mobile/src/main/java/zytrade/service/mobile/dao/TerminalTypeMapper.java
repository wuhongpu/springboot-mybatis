package zytrade.service.mobile.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import zytrade.service.mobile.entity.TerminalTypeDO;

import java.sql.SQLException;
import java.util.List;

public interface TerminalTypeMapper {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(TerminalTypeDO record);
//
//    int insertSelective(TerminalTypeDO record);
//
//    TerminalTypeDO selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(TerminalTypeDO record);
//
//    int updateByPrimaryKey(TerminalTypeDO record);

    /**
     * 逻辑删除信息
     * @param terminalTypeDO
     * @return
     * @throws SQLException
     */
    public int logicDelete(TerminalTypeDO terminalTypeDO) throws SQLException;
    /**
     * 根据机构ID查询终端类型列表
     * @param orgId
     * @return
     * @throws SQLException
     */
    public List<TerminalTypeDO> searchORGTerminalList(Long orgId) throws SQLException;

    /**
     * 根据终端类型id获取终端类型名称
     * @param id
     * @return
     * @throws SQLException
     */
    public TerminalTypeDO getTemrminalNameById(Long id) throws SQLException;

}