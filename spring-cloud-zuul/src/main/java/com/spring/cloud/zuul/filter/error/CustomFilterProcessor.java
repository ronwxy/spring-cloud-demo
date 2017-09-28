package com.spring.cloud.zuul.filter.error;

import com.netflix.zuul.FilterProcessor;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.util.ZuulRuntimeException;

/**
 * 定制过滤器处理类
 * @author wuxy@ieyecloud.com
 * @date 2017/9/28 11:25
 */
public class CustomFilterProcessor extends FilterProcessor {
    @Override
    public Object processZuulFilter(ZuulFilter filter) throws ZuulException {
        try{
            return super.processZuulFilter(filter);
        } catch(ZuulException e){
            throw new ZuulRuntimeException(e);
        } catch(Exception e){
            throw new ZuulRuntimeException(e);
        }
    }
}
