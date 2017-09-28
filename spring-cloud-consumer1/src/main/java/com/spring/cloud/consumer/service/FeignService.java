package com.spring.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 9:43
 */
@FeignClient(name="hello-service1")
public interface FeignService {

    @RequestMapping("/srv1/hello1")
    String hello1(@RequestParam(name = "name", required = true)String name);

    @RequestMapping("/srv1/upcase")
    String upcase(@RequestParam(name = "value", required = true)String value);
}
