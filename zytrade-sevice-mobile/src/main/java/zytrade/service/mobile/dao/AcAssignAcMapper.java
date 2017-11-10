package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.AcAssignAcDO;

interface AcAssignAcMapper {
    int insert(AcAssignAcDO record);
    int insertSelective(AcAssignAcDO record);

}