package com.provider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testController")
@Api(tags = "测试接口")
public class TestController {

    @RequestMapping("getName")
    @ApiOperation("获取名称")
    public String getName(String id){
        return "二狗蛋子";
    }
}
