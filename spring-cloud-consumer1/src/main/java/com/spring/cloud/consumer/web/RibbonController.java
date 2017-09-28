package com.spring.cloud.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/22 8:09
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(name = "name", required = true) String name) {
        String res = restTemplate.getForObject("http://hello-service1/srv1/hello1?name=" + name, String.class);
        String res2 = restTemplate.getForObject("http://hello-service1/srv1/upcase?value=" + res, String.class);
        return res2;
    }
}
