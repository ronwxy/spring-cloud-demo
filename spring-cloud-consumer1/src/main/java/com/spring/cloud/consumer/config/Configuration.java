package com.spring.cloud.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author wuxy@ieyecloud.com
 * @date 2017/9/22 8:07
 */
@RefreshScope
@Component
public class Configuration {

    @Value("${question.day.max}")
    private int questionDayMax;

    public int getQuestionDayMax() {
        return questionDayMax;
    }

    public void setQuestionDayMax(int questionDayMax) {
        this.questionDayMax = questionDayMax;
    }
}
