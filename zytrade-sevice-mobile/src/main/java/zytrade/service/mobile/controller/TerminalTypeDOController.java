package zytrade.service.mobile.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zytrade.service.mobile.entity.TerminalTypeDO;
import zytrade.service.mobile.service.TerminalTypeDOService;

import java.sql.SQLException;

/**
 * @Author: Wu
 * @Description:
 * @Date: Create in 15:31 2017/11/9
 * @Modified By:
 */
@RestController
@MapperScan("zytrade.service.mobile.dao")
public class TerminalTypeDOController {
    @Autowired
    private TerminalTypeDOService terminalTypeDOService;
    /**
     * @Author: Wu
     * @Description: 根据id查询终端名
     * @Date:  Create in 15:31 2017/11/9
     */
    @GetMapping("/test/{id}")
    public TerminalTypeDO findById(@PathVariable Long id) throws SQLException {

        return this.terminalTypeDOService.getTemrminalNameById(id);
    }






}
