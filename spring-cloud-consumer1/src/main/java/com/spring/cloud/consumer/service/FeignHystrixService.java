package com.spring.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 10:20
 */
@FeignClient(name="hello-service1", fallback = FeignHystrixServiceFallback.class)
public interface FeignHystrixService {

    @RequestMapping("/srv2/timeout")
    String timeout(@RequestParam(name = "name", required = true) String name);

    @RequestMapping("/srv2/exception")
    String error(@RequestParam(name = "value", required = true) String value);
}
