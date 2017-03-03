package com.noob.fund.enums;

/**
 * 开放式基金业务类型
 *
 * @author luyun
 * @since 2017.03.03
 */
public enum FundBizTypeEnum {

    ACCOUNT_OPEN("001", "101", "开户"),
    ACCOUNT_CLOSE("002", "102", "销户"),
    ACCOUNT_MODIFY("003", "103", "账户信息修改"),
    ACCOUNT_FROZEN("004", "104", "基金账户冻结"),
    ACCOUNT_UNFROZEN("005", "105", "基金账户解冻"),
    ACCOUNT_REPORT_LOSS("006", "106", "基金账户解冻"),
    ACCOUNT_UN_REPORT_LOSS("007", "107", "基金账户卡解挂"),
    ACCOUNT_ADD("008", "108", "增加交易账户"),
    ACCOUNT_CANCEL("009", "109", "撤销交易账户"),

    SUBSCRIBE("020", "120", "认购"),
    PREENGAGE_SUBSCRIBE("021", "121", "预约认购"),

    BUY("022", "122", "申购"),
    PREENGAGE_BUY("023", "123", "预约申购"),

    REDEEM("024", "124", "赎回"),
    PREENGAGE_REDEEM("025", "125", "预约赎回"),

    FUND_SELLER_CHANGE("026", "126", "转销售人/机构"),
    FUND_SELLER_CHANGE_IN("027", "127", "转销售人/机构转入"),
    FUND_SELLER_CHANGE_OUT("028", "128", "转销售人/机构转出"),

    SET_DIVIDEND_METHOD("029", "128", "设置分红方式"),
    SUBSCRIBE_RESULT(null, "130", "认购结果"),

    FUND_SHARES_FROZEN("031", "131", "基金份数冻结"),
    FUND_SHARES_UNFROZEN("032", "132", "基金份数解冻"),

    SHARE_TRANSFER("033", "133", "非交易过户"),
    SHARE_TRANSFER_IN("034", "134", "非交易过户转入"),
    SHARE_TRANSFER_OUT("035", "135", "非交易过户转出"),

    CONVERSION("036", "136", "基金转换"),
    CONVERSION_IN("037", "137", "基金转换转入"),
    CONVERSION_OUT("038", "138", "基金转换转出"),

    TIMING_QUOTA_BUY("039", "139", "定时定额申购"),

    REFUND("040", "140", "退款"),
    REPLENISHMENT("041", "141", "补款"),

    FORCE_REDEEM(null, "142", "强行赎回"),
    DIVIDEND(null, "143", "红利发放"),
    FORCE_INCREASE(null, "144", "强行调增"),
    FORCE_DECREASE(null, "145", "强行调减"),

    DISTRIBUTION(null, "146", "配号"),
    RAISE_FAIL(null, "149", "募集失败"),

    FUND_LIQUIDATION(null, "150", "基金清盘"),
    FUND_CLEARING(null, "151", "基金终止"),

    ORDER_CANCEL("052", "152", "撤单"),
    PREENGAGE_ORDER_CANCEL("053", "153", "撤预约单"),

    INEFFECTIVE_FUND("054", "154", "无效资金"),

    FUND_SELLER_CLEARING(null, "155", "基金销售人资金清算"),
    FUND_HOLDER_CLEARING(null, "156", "投资人资金清算"),

    DIVIDEND_UNFROZEN(null, "157", "红利解冻"),
    TRADE_ACCOUNT_CHANGE("058", "158", "变更交易账号"),

    TIMING_QUOTA_BUY_OPEN("059", "159", "定时定额申购开通"),
    TIMING_QUOTA_BUY_CANCEL("060", "160", "定时定额申购撤销"),
    TIMING_QUOTA_BUY_MODIFY("061", "161", "定时定额申购修改"),

    SUBSCRIBE_ADJUSTMENT("062", "162", "认购调整"),
    TIMING_QUOTA_REDEEM("063", "163", "定时定额赎回"),
    FUND_JOINT_CARD_OPEN("067", "167", "基金联名卡开通"),
    FUND_JOINT_CARD_CANCEL("068", "168", "基金联名卡撤销"),
    SCORE_CONFIRM(null, "169", "积分确认"),
    AREA_NUMBER_CHANGE_NOTIFICATION("070", null, "地区编号变更通知"),
    AUTHENTIC_RIGHT("080", "180", "确权"),
    PLEDGE("088", "188", "基金质押"),

    ETF_BUY("091", "191192", "ETF 基金申购"),
    ETF_REDEEM("093", "193、194", "ETF 基金赎回"),

    QUICK_TRANSFER("098", "198", "快速过户"),;


    /**
     * 申请业务代码
     */
    String applyCode;
    /**
     * 确认业务代码
     */
    String confirmCode;
    /**
     * 业务名称
     */
    String bizName;

    FundBizTypeEnum(String applyCode, String confirmCode, String bizName) {
        this.applyCode = applyCode;
        this.confirmCode = confirmCode;
        this.bizName = bizName;
    }
}
