package com.noob.fund.enums;

/**
 * 识别方式
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum RecognitionTypeEnum {

    REDUCE_TO_WRITING("1", "书面委托"),

    SEAL("2", "印鉴"),

    PASSWORD("3", "密码"),

    CERTIFICATE("4", "证件");

    private String code;

    private String name;

    RecognitionTypeEnum(String code, String name) {
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
