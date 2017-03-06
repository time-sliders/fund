package com.noob.fund.enums;

/**
 * 性别枚举
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum SexEnum {

    MALE("1", "男"),

    FEMALE("2", "女");

    private String code;

    private String name;

    SexEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
