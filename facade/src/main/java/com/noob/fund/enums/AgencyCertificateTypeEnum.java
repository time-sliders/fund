package com.noob.fund.enums;

/**
 * 机构证件类型
 *
 * @author luyun
 * @since 2017.03.03
 */
public enum AgencyCertificateTypeEnum {

    ORGANIZATION_CODE_CERTIFICATE("0","组织机构代码证"),

    BUSINESS_LICENCE("1","营业执照"),

    ADMINISTRATIVE_ORGAN("2","行政机关"),

    SOCIOGROUP("3","社会团体"),

    ARMY("4","军队"),

    ARMED_POLICE("5","武警"),

    SUBORDINATE_BODY("6","下属机构(具有主管单位批文号)"),

    FOUNDATION("7","基金会"),

    OTHER("8","其它"),;

    private String code;

    private String name;

    AgencyCertificateTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
