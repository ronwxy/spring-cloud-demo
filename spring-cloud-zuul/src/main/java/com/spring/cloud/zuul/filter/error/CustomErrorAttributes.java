package com.spring.cloud.zuul.filter.error;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 11:28
 */
@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace){
        Map<String, Object> result = super.getErrorAttributes(requestAttributes, includeStackTrace);
        result.put("code", result.get("status"));
        result.put("msg", result.get("message"));
        //result.remove("error");
        //result.remove("exception");
        //result.remove("message");
        //result.remove("status");
        return result;
    }
}
