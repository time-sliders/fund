package com.noob.fund.annotation;

import com.noob.fund.enums.DataType;

import java.lang.annotation.*;

/**
 * 字段类型
 *
 * @author luyun
 * @since 2017.03.03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Type {

    DataType value();
}
