package com.spring.cloud.consumer.web;

import com.spring.cloud.consumer.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 10:08
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private FeignHystrixService hystrixService;

    @RequestMapping("timeout")
    public String hello(@RequestParam(name="name", required = true)String name){
        return hystrixService.timeout(name);
    }

    @RequestMapping("error")
    public String upcase(@RequestParam(name="name", required = true)String name){
        return hystrixService.error(name);
    }
}
