package com.noob.fund.annotation;

import java.lang.annotation.*;

/**
 * 日期格式
 *
 * @author luyun
 * @since 2017.03.03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DatePattern {

    String value();
}
