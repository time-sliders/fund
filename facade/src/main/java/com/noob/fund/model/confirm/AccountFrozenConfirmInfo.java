package com.noob.fund.model.confirm;

import com.noob.fund.annotation.DatePattern;
import com.noob.fund.annotation.Length;
import com.noob.fund.annotation.Necessary;
import com.noob.fund.annotation.Type;
import com.noob.fund.enums.DataType;
import com.noob.fund.enums.FrozenCauseEnum;
import com.noob.storage.utils.DateUtil;

import java.io.Serializable;

/**
 * 基金账户解冻申请(005),基金账户卡解挂申请(007)
 * <p>
 * 基金账户解冻申请是投资人或司法等有关部门对投资人的基金账户􏰁出解除冻结的申请。
 * 基金账户卡解挂申请是指投资人在一定的时间内,􏰁出解除基金账户卡挂失状态的申请。
 *
 * @author luyun
 * @since 2017.03.29
 */
public class AccountFrozenConfirmInfo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 申请单编号(同一销售机构不能重复)
     */
    @Type(DataType.A)
    @Length(24)
    @Necessary(true)
    private Integer appSheetSerialNo;

    /**
     * 冻结原因
     *
     * @see FrozenCauseEnum
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(true)
    private Integer frozenCause;

    /**
     * 交易发生日期 (指申报日期)
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(true)
    private Integer transactionDate;

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
     * 交易所在地区编号
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(false)
    private Integer regionCode;

    /**
     * 网点号码
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(true)
    private String branchCode;

    /**
     * TA 的原确认流水号
     */
    @Type(DataType.A)
    @Length(20)
    @Necessary(false)
    private Long originalSerialNo;

    /**
     * 原申请单编号
     */
    @Type(DataType.A)
    @Length(24)
    @Necessary(false)
    private Long originalAppSheetNo;

    /**
     * 交易发生时间
     */
    @DatePattern(DateUtil.hhMMss)
    @Type(DataType.A)
    @Length(6)
    @Necessary(true)
    private Integer transactionTime;

    /**
     * TA 的原确认日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer originalCfmDate;

    /**
     * 摘要/说明
     * 对基金账户冻结解冻业务,可填入填入法律文号、质押合同编号等信息
     */
    @Type(DataType.C)
    @Length(60)
    @Necessary(false)
    private String specification;

    public Integer getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(Integer appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
    }

    public Integer getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(Integer frozenCause) {
        this.frozenCause = frozenCause;
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

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Long getOriginalSerialNo() {
        return originalSerialNo;
    }

    public void setOriginalSerialNo(Long originalSerialNo) {
        this.originalSerialNo = originalSerialNo;
    }

    public Long getOriginalAppSheetNo() {
        return originalAppSheetNo;
    }

    public void setOriginalAppSheetNo(Long originalAppSheetNo) {
        this.originalAppSheetNo = originalAppSheetNo;
    }

    public Integer getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Integer getOriginalCfmDate() {
        return originalCfmDate;
    }

    public void setOriginalCfmDate(Integer originalCfmDate) {
        this.originalCfmDate = originalCfmDate;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
