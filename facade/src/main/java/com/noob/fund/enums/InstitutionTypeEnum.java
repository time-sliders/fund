package com.noob.fund.enums;

/**
 * 机构类型
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum InstitutionTypeEnum {

    INSURANCE_COMPANY("0", "保险机构"),

    FUND_COMPANY("1", "基金公司"),

    LISTED_COMPANY("2", "上市公司"),

    TRUST_COMPANY("3", "信托公司"),

    SECURITIES_COMPANY("4", "证券公司"),

    FINANCIAL_PRODUCTS("5", "理财产品"),

    SUPPLEMENTARY_PENSION("6", "企业年金"),

    SOCIAL_INSURANCE_FUNDS("7", "社保基金"),

    OTHERS("8", "其他机构");

    private String code;

    private String name;

    InstitutionTypeEnum(String code, String name) {
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
