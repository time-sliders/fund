package com.noob.fund.model.confirm;

import com.noob.fund.annotation.DatePattern;
import com.noob.fund.annotation.Length;
import com.noob.fund.annotation.Necessary;
import com.noob.fund.annotation.Type;
import com.noob.fund.consts.MultiAcctFlag;
import com.noob.fund.enums.DataType;
import com.noob.storage.utils.DateUtil;

import java.io.Serializable;

/**
 * 开户确认信息
 *
 * @author luyun
 * @since 2017.03.06
 */
public class OpenAccountConfirmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请单编号
     * 同一销售机构不能重复
     */
    @Type(DataType.A)
    @Length(24)
    @Necessary(true)
    private Integer appSheetSerialNo;

    /**
     * 交易确认日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(true)
    private Integer transactionCfmDate;

    /**
     * 交易处理返回代码
     *
     * @see com.noob.fund.enums.ReturnCodeEnum
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(true)
    private Integer returnCode;

    /**
     * 投资人基金交易账号
     * 投资人在销售机构内开设的用于交易的账号
     */
    @Type(DataType.A)
    @Length(17)
    @Necessary(true)
    private Integer transactionAccountID;

    /**
     * 销售人代码
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(true)
    private String distributorCode;

    /**
     * 业务代码
     *
     * @see com.noob.fund.enums.FundBizTypeEnum
     */
    @Type(DataType.A)
    @Length(3)
    @Necessary(true)
    private Integer businessCode;

    /**
     * 投资人基金账号
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(true)
    private String TAAccountID;

    /**
     * 多渠道开户标志
     *
     * @see MultiAcctFlag
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(false)
    private Integer multiAcctFlag;

    /**
     * 网点号码
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(true)
    private String branchCode;

    /**
     * 交易发生日期 (指申报日期)
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(true)
    private Integer transactionDate;

    /**
     * 交易发生时间
     */
    @DatePattern(DateUtil.hhMMss)
    @Type(DataType.A)
    @Length(6)
    @Necessary(true)
    private Integer transactionTime;

    /**
     * TA确认交易流水号
     */
    @DatePattern(DateUtil.hhMMss)
    @Type(DataType.A)
    @Length(20)
    @Necessary(false)
    private Integer TASerialNO;

    /**
     * 是否注册登记人发起业务标志
     *
     * @see com.noob.fund.consts.FromTAFlag
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(false)
    private Integer fromTAFlag;

    /**
     * 交易所在地区编号
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(false)
    private Integer regionCode;

    public Integer getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(Integer appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
    }

    public Integer getTransactionCfmDate() {
        return transactionCfmDate;
    }

    public void setTransactionCfmDate(Integer transactionCfmDate) {
        this.transactionCfmDate = transactionCfmDate;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public Integer getTransactionAccountID() {
        return transactionAccountID;
    }

    public void setTransactionAccountID(Integer transactionAccountID) {
        this.transactionAccountID = transactionAccountID;
    }

    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    public Integer getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(Integer businessCode) {
        this.businessCode = businessCode;
    }

    public String getTAAccountID() {
        return TAAccountID;
    }

    public void setTAAccountID(String TAAccountID) {
        this.TAAccountID = TAAccountID;
    }

    public Integer getMultiAcctFlag() {
        return multiAcctFlag;
    }

    public void setMultiAcctFlag(Integer multiAcctFlag) {
        this.multiAcctFlag = multiAcctFlag;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Integer transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Integer getTASerialNO() {
        return TASerialNO;
    }

    public void setTASerialNO(Integer TASerialNO) {
        this.TASerialNO = TASerialNO;
    }

    public Integer getFromTAFlag() {
        return fromTAFlag;
    }

    public void setFromTAFlag(Integer fromTAFlag) {
        this.fromTAFlag = fromTAFlag;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }
}
