package com.spring.cloud.consumer.web;

import com.spring.cloud.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 9:19
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("hello")
    public String hello(@RequestParam(name="name", required = true)String name){
        return feignService.upcase(feignService.hello1(name));
    }
}
