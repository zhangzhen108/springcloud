package com.order.service.impl;

import com.order.dao.demo.CourseInfoMapper;
import com.order.domain.demo.CourseInfoDO;
import com.order.dto.demo.CourseInfoDTO;
import com.order.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    CourseInfoMapper courseInfoMapper;
    @Resource
    CourseInfoTrans courseInfoTrans;
    @Override
    public CourseInfoDTO getdemo(CourseInfoDTO courseInfoDTO) {
        CourseInfoDO courseInfoDO =courseInfoMapper.selectByPrimaryKey(courseInfoDTO.getId());
        CourseInfoDTO courseInfoDTO1=courseInfoTrans.toDto(courseInfoDO);
        return courseInfoDTO1;
    }
}
