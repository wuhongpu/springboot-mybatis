package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.AcAssignDO;

public interface AcAssignMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AcAssignDO record);

    int insertSelective(AcAssignDO record);

    AcAssignDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcAssignDO record);

    int updateByPrimaryKey(AcAssignDO record);
}