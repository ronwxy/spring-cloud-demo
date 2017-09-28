package com.spring.cloud.zuul;

import com.netflix.zuul.FilterProcessor;
import com.spring.cloud.zuul.filter.error.CustomFilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 10:35
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        FilterProcessor.setProcessor(new CustomFilterProcessor());
    }
}
