package com.noob.fund.enums;

/**
 * 冻结原因
 *
 * @author luyun
 * @since 2017.03.09
 */
public enum  FrozenCauseEnum {

    JUDICIAL_FREEZE(0, "司法冻结"),

    COUNTER_FREEZE(1, "柜台冻结"),

    PLEDGE_FREEZE(2, "质押冻结"),

    PLEDGE_JUDICIAL_FREEZE(3, "质押、司法双重冻结"),

    COUNTER_JUDICIAL_FREEZE(4, "柜台、司法双重冻结");

    private Integer code;

    private String name;

    FrozenCauseEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
