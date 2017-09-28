package com.spring.cloud.consumer.web;

import com.spring.cloud.consumer.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 9:19
 */
@RestController
@RequestMapping("config")
public class ConfigController {

    @Autowired
    private Configuration config;

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String readConfig(){
        return "config question day max: " + config.getQuestionDayMax();
    }
}
