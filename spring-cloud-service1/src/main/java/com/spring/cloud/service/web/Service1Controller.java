package com.spring.cloud.service.web;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 9:00
 */
@RestController
@RequestMapping("/srv1")
public class Service1Controller {

    @RequestMapping("/hello1")
    public String hello1(@RequestParam(name = "name", required = true)String name){
        return "hello, " + name;
    }

    @RequestMapping("/upcase")
    public String upcase(@RequestParam(name = "value", required = true)String value){
        if(StringUtils.isBlank(value)){
            return value;
        }
        return value.toUpperCase();
    }
}
