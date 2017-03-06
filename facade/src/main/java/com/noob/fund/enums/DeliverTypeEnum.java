package com.noob.fund.enums;

/**
 * 寄送方式枚举
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum DeliverTypeEnum {

    NOT_SEND("1", "不寄送"),

    MONTH("2", "按月"),

    QUARTER("3", "按季"),

    HALF_YEAR("4", "半年"),

    ONE_YEAR("5", "一年");

    private String code;

    private String name;

    DeliverTypeEnum(String code, String name) {
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
