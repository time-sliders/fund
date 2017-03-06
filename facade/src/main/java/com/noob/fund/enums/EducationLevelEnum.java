package com.noob.fund.enums;

/**
 * 学历枚举
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum EducationLevelEnum {

    POSTGRADUATE("01","研究生"),

    UNDERGRADUATE_COLLEGE("02","大学本科"),

    JUNIOR_COLLEGE("03","大学专科"),

    POST_SECONDARY("04","中专或技校"),

    VESTIBULE_SCHOOL("05","技工学校"),

    HIGH_SCHOOL("06","高中"),

    JUNIOR_MIDDLE_SCHOOL("07","初中"),

    PRIMARY_SCHOOL("08","小学"),

    ILLITERACY("09","文盲或半文盲");

    private String code;

    private String name;

    EducationLevelEnum(String code, String name) {
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
