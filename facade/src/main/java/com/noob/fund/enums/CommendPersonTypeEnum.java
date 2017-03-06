package com.noob.fund.enums;

/**
 * 推荐人类型
 *
 * @author luyun
 * @since 2017.03.06
 */
public enum CommendPersonTypeEnum {

    OTHER("0", "其他"),

    INTERNAL_STAFF("1", "内部员工"),

    REGISTERED_USER("2", "注册用户"),

    FUND_ACCOUNT("3", "基金账户"),

    CLIENT_MANAGER_NO("4", "客户经理编号"),

    CLIENT_MANAGER_NAME("5", "客户经理姓名");

    private String code;

    private String name;

    CommendPersonTypeEnum(String code, String name) {
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
