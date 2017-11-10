package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.MposApplyDO;

public interface MposApplyMapper {
    int deleteByPrimaryKey(String orgmcode);

    int insert(MposApplyDO record);

    int insertSelective(MposApplyDO record);

    MposApplyDO selectByPrimaryKey(String orgmcode);

    int updateByPrimaryKeySelective(MposApplyDO record);

    int updateByPrimaryKey(MposApplyDO record);
}