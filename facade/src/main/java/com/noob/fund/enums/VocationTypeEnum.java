package com.noob.fund.enums;

/**
 * 职业枚举
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum VocationTypeEnum {

    PARTY_AND_INSTITUTION("01", "党政机关、事业单位"),

    ENTERPRISE_UNITS("02", "企业单位"),

    FREE("03", "自由业主"),

    STUDENT("04", "学生"),

    SOLDIER("05", "军人"),

    OTHER("06", "其他");

    private String code;

    private String name;

    VocationTypeEnum(String code, String name) {
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
