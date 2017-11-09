package zytrade.service.mobile.dao;

import zytrade.service.mobile.entity.PersonDO;

public interface PersonDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonDO record);

    int insertSelective(PersonDO record);

    PersonDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonDO record);

    int updateByPrimaryKey(PersonDO record);
}