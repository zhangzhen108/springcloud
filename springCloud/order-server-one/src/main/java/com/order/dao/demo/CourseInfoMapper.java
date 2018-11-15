package com.order.dao.demo;

import com.order.domain.demo.CourseInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseInfoDO record);

    int insertSelective(CourseInfoDO record);

    CourseInfoDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseInfoDO record);

    int updateByPrimaryKey(CourseInfoDO record);
}