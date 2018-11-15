package com.order.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.order.dto.demo.CourseInfoDTO;
import com.order.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Api(tags = "订单系统接口", description = "订单系统模块相关接口")
public class OrderServerController {
    @Resource
    DemoService demoService;
    @PostMapping("/orderSomething")
    @ApiOperation(value = "下单")
    public String pay() {
        return "订单接口demo";
    }
    @PostMapping("/demo")
    @ApiOperation(value = "例子")
    public String demoService(CourseInfoDTO courseInfoDTO) {
        CourseInfoDTO courseInfoDTO1=demoService.getdemo(courseInfoDTO);
        return JSON.toJSONString(courseInfoDTO1);
    }
}
