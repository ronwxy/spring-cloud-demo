package com.spring.cloud.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 10:05
 */
@Component
public class FeignHystrixServiceFallback implements FeignHystrixService{

    @Override
    public String timeout(@RequestParam(name = "name", required = true) String name) {
        return "哇哦，出错了！";
    }

    @Override
    public String error(@RequestParam(name = "value", required = true) String value) {
        return "哇哦，出错了！";
    }
}
