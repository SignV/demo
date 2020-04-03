package com.signv.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: HuangXiaoLong
 * @Date: 2020/4/3 14:50
 * @Description: 测试Controller
 */
@RestController("nhmKpiDataController")
@RequestMapping(value = "/v1/api/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @GetMapping(value = "/getData")
    public String getData(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(num != null) {
            return simpleDateFormat.format(new Date()) + ": " + (num * num);
        }
        return simpleDateFormat.format(new Date()) + ": num is null";
    }
}
