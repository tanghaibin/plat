package com.plat.app.controller;

import com.plat.common.util.JsonUtil;
import com.plat.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author haibin.tang
 * @create 2018-04-26 下午9:07
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public String test() {
        return JsonUtil.obj2Json(testService.findAll());
    }
}
