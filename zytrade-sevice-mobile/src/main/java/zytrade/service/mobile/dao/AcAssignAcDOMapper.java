package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.AcAssignAcDO;

public interface AcAssignAcDOMapper {
    int insert(AcAssignAcDO record);

    int insertSelective(AcAssignAcDO record);
}