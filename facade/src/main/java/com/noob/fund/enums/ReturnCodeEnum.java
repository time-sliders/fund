package com.noob.fund.enums;

/**
 * 交易处理返回代码
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum ReturnCodeEnum {

    ;

    private String code;

    private String name;

    ReturnCodeEnum(String code, String name) {
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
