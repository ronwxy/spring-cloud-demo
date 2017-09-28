package com.spring.cloud.service.web;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 10:10
 */
@RestController
@RequestMapping("/srv2")
public class Service2Controller {

    @RequestMapping("/timeout")
    public String timeout(@RequestParam(name = "name", required = true) String name) {
        try {
            Thread.sleep(1000 * RandomUtils.nextInt(3));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "hello, " + name;
    }

    @RequestMapping("/exception")
    public String error(@RequestParam(name = "value", required = true) String value) {
        throw new RuntimeException();
    }
}
