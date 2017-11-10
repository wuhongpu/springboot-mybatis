package zytrade.service.mobile.service;

import org.springframework.stereotype.Service;
import zytrade.service.mobile.entity.TerminalTypeDO;

import java.sql.SQLException;

/**
 * @Author: Wu
 * @Description:
 * @Date: Create in 15:25 2017/11/9
 * @Modified By:
 */
public interface TerminalTypeDOService {
    /**
     * 根据终端类型id获取终端类型名称
     * @param TerminalTypeDOId
     * @return
     * @throws SQLException
     */
    public TerminalTypeDO getTemrminalNameById(Long TerminalTypeDOId) throws SQLException;
}
