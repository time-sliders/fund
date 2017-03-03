package com.noob.fund.enums;

/**
 * 个人证件类型
 *
 * @author luyun
 * @since 2017.03.03
 */
public enum PersonalCertificateTypeEnum {

    IDENTIFICATION_CARD("0", "身份证"),

    PASSPORT("1", "护照"),

    OFFICIAL_CARD("2", "军官证"),

    SOLDBUCH("3", "士兵证"),

    HOME_RETURN_PERMIT("4", "港澳居民来往内地通行证"),

    FAMILY_REGISTER("5", "户口本"),

    FOREIGN_PASSPORT("6", "外国护照"),

    OTHER("7", "其他"),

    CIVIL_CERTIFICATE("8", "文职证"),

    POLICE_CARD("9", "警官证"),

    MTP("A", "台胞证");

    private String code;

    private String name;

    PersonalCertificateTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
