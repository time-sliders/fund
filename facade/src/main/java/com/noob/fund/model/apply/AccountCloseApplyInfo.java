package com.noob.fund.model.apply;

import com.noob.fund.annotation.DatePattern;
import com.noob.fund.annotation.Length;
import com.noob.fund.annotation.Necessary;
import com.noob.fund.annotation.Type;
import com.noob.fund.enums.AgencyCertificateTypeEnum;
import com.noob.fund.enums.DataType;
import com.noob.fund.enums.PersonalCertificateTypeEnum;
import com.noob.storage.utils.DateUtil;

import java.io.Serializable;

/**
 * 销户/撤销交易账户申请数据
 * 销户申请(002),撤销交易账户申请(009)
 * <p>
 * 销户申请是指投资人向注册登记人􏰁出撤销其基金账户的申请。
 * 撤销交易账户申请是指投资人􏰁出撤销其交易账户的申请。
 *
 * @author luyun
 * @since 2017.03.09
 */
public class AccountCloseApplyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请单编号(同一销售机构不能重复)
     */
    @Type(DataType.A)
    @Length(24)
    @Necessary(true)
    private Integer appSheetSerialNo;

    /**
     * 交易发生日期
     */
    @Type(DataType.A)
    @Length(8)
    @Necessary(true)
    @DatePattern(DateUtil.yyyyMMdd)
    private Integer transactionDate;

    /**
     * 投资人基金交易账号
     * (投资人在销售机构内开设的用于交易的账号)
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
     * <strong>该字段接口文档终定义为 DataType.A</strong>
     *
     * @see com.noob.fund.enums.FundBizTypeEnum
     */
    @Type(DataType.C)
    @Length(3)
    @Necessary(true)
    private String businessCode;

    /**
     * 投资人基金账号
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(true)
    private String TAAccountID;

    /**
     * 个人证件类型及机构证件类型
     *
     * @see PersonalCertificateTypeEnum
     * @see AgencyCertificateTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String certificateType;

    /**
     * 交易所在地区编号
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(false)
    private Integer regionCode;

    /**
     * 投资人证件号码
     */
    @Type(DataType.C)
    @Length(30)
    @Necessary(false)
    private String certificateNo;

    /**
     * 网点号码
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(true)
    private String branchCode;

    /**
     * 交易发生时间
     */
    @DatePattern(DateUtil.hhMMss)
    @Type(DataType.A)
    @Length(6)
    @Necessary(true)
    private Integer transactionTime;

    public Integer getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(Integer appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
    }

    public Integer getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Integer transactionDate) {
        this.transactionDate = transactionDate;
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

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getTAAccountID() {
        return TAAccountID;
    }

    public void setTAAccountID(String TAAccountID) {
        this.TAAccountID = TAAccountID;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }
}
