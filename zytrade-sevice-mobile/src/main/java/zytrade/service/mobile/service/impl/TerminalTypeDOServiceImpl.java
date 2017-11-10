package zytrade.service.mobile.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zytrade.service.mobile.dao.TerminalTypeMapper;
import zytrade.service.mobile.entity.TerminalTypeDO;
import zytrade.service.mobile.service.TerminalTypeDOService;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: Wu
 * @Description:
 * @Date: Create in 15:25 2017/11/9
 * @Modified By:
 */
@Service("terminalTypeDOService")
public class TerminalTypeDOServiceImpl implements TerminalTypeDOService{
    @Autowired
    private TerminalTypeMapper terminalTypeMapper;
    /**
     * @Author: Wu
     * @Description:根据终端id 查询终端类型名
     * @Date:  Create in 15:25 2017/11/9
     */
    public TerminalTypeDO getTemrminalNameById(Long TerminalTypeDOId) throws SQLException {
        System.out.println(TerminalTypeDOId);
        System.out.println(terminalTypeMapper.getClass());
        return terminalTypeMapper.getTemrminalNameById(TerminalTypeDOId);
    }
}
