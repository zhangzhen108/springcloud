package com.order.service.impl;

import com.order.common.EntityMapper;
import com.order.domain.demo.CourseInfoDO;
import com.order.dto.demo.CourseInfoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseInfoTrans extends EntityMapper<CourseInfoDTO,CourseInfoDO> {

}
