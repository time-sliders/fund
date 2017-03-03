package com.noob.fund.annotation;

import java.lang.annotation.*;

/**
 * 字段长度
 *
 * @author luyun
 * @since 2017.03.03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length {

    int value();
}
