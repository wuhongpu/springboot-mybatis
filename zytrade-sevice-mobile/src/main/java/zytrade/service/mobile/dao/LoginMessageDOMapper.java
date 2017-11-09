package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.LoginMessageDO;

public interface LoginMessageDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginMessageDO record);

    int insertSelective(LoginMessageDO record);

    LoginMessageDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginMessageDO record);

    int updateByPrimaryKey(LoginMessageDO record);
}