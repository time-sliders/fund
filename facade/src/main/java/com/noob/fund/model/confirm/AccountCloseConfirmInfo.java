package com.noob.fund.model.confirm;

import com.noob.fund.annotation.DatePattern;
import com.noob.fund.annotation.Length;
import com.noob.fund.annotation.Necessary;
import com.noob.fund.annotation.Type;
import com.noob.fund.enums.AgencyCertificateTypeEnum;
import com.noob.fund.enums.DataType;
import com.noob.fund.enums.FrozenCauseEnum;
import com.noob.fund.enums.PersonalCertificateTypeEnum;
import com.noob.storage.utils.DateUtil;

import java.io.Serializable;

/**
 * 账户确认数据
 * <p>
 * 销户确认(102),
 * 账户信息修改确认(103),
 * 基金账户冻结确认(104),
 * 基金账户解冻确认(105),
 * 基金账户卡挂失确认(106),
 * 基金账户卡解挂确认(107),
 * 增加交易账户确认(108),
 * 撤销交易账户确认 (109)
 * <p>
 * 销户确认是基金注册登记人对投资人􏰁出的销户申请的处理结果。销户后,原基金账号作废,一般不再分配给其它投资人。
 * <p>
 * 账户修改确认是基金注册登记人对投资人􏰁出的账号信息修改申请的处理结果。
 * <p>
 * 基金账户冻结确认是基金注册登记人对投资人􏰁出的冻结申请的处理结果。账户在冻结后将不能接受投资人除解冻以外的其它任何业务申请。
 * <p>
 * 基金账户解冻确认是基金注册登记人对投资人􏰁出的解冻申请的的处理结果。账户解冻后将恢复该账户的正常状态。
 * <p>
 * 基金账户卡挂失确认是基金注册登记人对投资人􏰁出的基金账户卡挂失申请的处理结果。挂失后的基金账户在处理某些业务时受到限制。
 * <p>
 * 基金账户卡解挂确认是基金注册登记人对投资人􏰁出的基金账户卡解挂申请的处理结果。解挂后的基金账户为正常状态。
 * <p>
 * 增加交易账户确认是基金注册登记人对投资人􏰁出的增加交易账号申请的处理结果。增加交易账户可以实现一个基金账户对应多个交易账户,即一个投资人可以同时在多个销售人处进行交易。
 * <p>
 * 撤销交易账户确认是基金注册登记人对投资人􏰁出的撤销交易账户申请的处理结果。
 *
 * @author luyun
 * @since 2017.03.09
 */
public class AccountCloseConfirmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请单编号(同一销售机构不能重复)
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
     * 投资人证件号码
     */
    @Type(DataType.C)
    @Length(30)
    @Necessary(false)
    private String certificateNo;

    /**
     * 投资人户名
     */
    @Type(DataType.C)
    @Length(120)
    @Necessary(false)
    private String investorName;

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
     * 个人/机构标志
     * 0-机构,1-个人
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(false)
    private Integer individualOrInstitution;

    /**
     * 投资人户名简称
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(false)
    private String accountAbbr;

    /**
     * TA确认交易流水号
     */
    @Type(DataType.A)
    @Length(20)
    @Necessary(false)
    private Integer TASerialNO;

    /**
     * 基金账户卡的凭证号
     */
    @Type(DataType.C)
    @Length(8)
    @Necessary(false)
    private String accountCardID;

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
     * 摘要/说明
     * 对基金账户冻结解冻业务,可填入填入法律文号、质押合同编号等信息
     */
    @Type(DataType.C)
    @Length(60)
    @Necessary(false)
    private String specification;

    /**
     * 交易所在地区编号
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(false)
    private Integer regionCode;

    /**
     * 冻结原因
     *
     * @see FrozenCauseEnum
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(false)
    private Integer frozenCause;

    /**
     * 冻结截止日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer freezingDeadline;

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

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
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

    public Integer getIndividualOrInstitution() {
        return individualOrInstitution;
    }

    public void setIndividualOrInstitution(Integer individualOrInstitution) {
        this.individualOrInstitution = individualOrInstitution;
    }

    public String getAccountAbbr() {
        return accountAbbr;
    }

    public void setAccountAbbr(String accountAbbr) {
        this.accountAbbr = accountAbbr;
    }

    public Integer getTASerialNO() {
        return TASerialNO;
    }

    public void setTASerialNO(Integer TASerialNO) {
        this.TASerialNO = TASerialNO;
    }

    public String getAccountCardID() {
        return accountCardID;
    }

    public void setAccountCardID(String accountCardID) {
        this.accountCardID = accountCardID;
    }

    public Integer getFromTAFlag() {
        return fromTAFlag;
    }

    public void setFromTAFlag(Integer fromTAFlag) {
        this.fromTAFlag = fromTAFlag;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public Integer getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(Integer frozenCause) {
        this.frozenCause = frozenCause;
    }

    public Integer getFreezingDeadline() {
        return freezingDeadline;
    }

    public void setFreezingDeadline(Integer freezingDeadline) {
        this.freezingDeadline = freezingDeadline;
    }
}
