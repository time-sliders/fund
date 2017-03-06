package com.noob.fund.model;

import com.noob.fund.annotation.DatePattern;
import com.noob.fund.annotation.Length;
import com.noob.fund.annotation.Necessary;
import com.noob.fund.annotation.Type;
import com.noob.fund.consts.MultiAcctFlag;
import com.noob.fund.enums.*;
import com.noob.storage.utils.DateUtil;

import java.io.Serializable;

/**
 * 账户信息
 *
 * 涉及到的交易:
 * 开户申请(001)
 * 账户信息修改申请(003)
 *
 * @author luyun
 * @since 2017.03.03
 */
public class AccountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通讯地址
     */
    @Type(DataType.C)
    @Length(120)
    @Necessary(false)
    private String address;

    /**
     * 法人代表身份证件代码
     */
    @Type(DataType.C)
    @Length(30)
    @Necessary(false)
    private String instReprIDCode;

    /**
     * 法人代表证件类型
     *
     * @see PersonalCertificateTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String instReprIDType;

    /**
     * 法人代表姓名
     */
    @Type(DataType.C)
    @Length(20)
    @Necessary(false)
    private String instReprName;

    /**
     * 申请单编号(同一销售机构不能重复)
     */
    @Type(DataType.A)
    @Length(24)
    @Necessary(true)
    private Integer appSheetSerialNo;

    /**
     * 个人证件类型及机构证件类型
     *
     * @see PersonalCertificateTypeEnum
     * @see AgencyCertificateTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(true)
    private String certificateType;

    /**
     * 投资人证件号码
     */
    @Type(DataType.C)
    @Length(30)
    @Necessary(true)
    private String certificateNo;

    /**
     * 投资人户名
     */
    @Type(DataType.C)
    @Length(120)
    @Necessary(true)
    private String investorName;

    /**
     * 交易发生日期
     */
    @Type(DataType.A)
    @Length(8)
    @Necessary(true)
    @DatePattern(DateUtil.yyyyMMdd)
    private Integer transactionDate;

    /**
     * 个人/机构标志
     * 0-机构,1-个人
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(true)
    private Integer individualOrInstitution;

    /**
     * 机构类型
     *
     * @see InstitutionTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String institutionType;

    /**
     * 投资人邮政编码
     */
    @Type(DataType.A)
    @Length(6)
    @Necessary(false)
    private Integer postCode;

    /**
     * 经办人证件号码
     * (对机构必填)
     */
    @Type(DataType.C)
    @Length(30)
    @Necessary(false)
    private String transactorCertNo;

    /**
     * 经办人证件类型
     * (对机构必填)
     *
     * @see PersonalCertificateTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String transactorCertType;

    /**
     * 经办人姓名
     * (对机构必填)
     */
    @Type(DataType.C)
    @Length(20)
    @Necessary(false)
    private String transactorName;

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
     * 基金管理人在资金清算机构的交收账号
     */
    @Type(DataType.C)
    @Length(28)
    @Necessary(false)
    private String acctNoOfFMInClearingAgency;

    /**
     * 基金管理人在资金清算机构的交收账号
     */
    @Type(DataType.C)
    @Length(60)
    @Necessary(false)
    private String acctNameOfFMInClearingAgency;

    /**
     * 基金资金清算机构代码
     */
    @Type(DataType.A)
    @Length(9)
    @Necessary(false)
    private Integer clearingAgencyCode;

    /**
     * 投资人出生日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer investorsBirthday;

    /**
     * 投资人在销售人处用于交易的资金账号
     */
    @Type(DataType.C)
    @Length(19)
    @Necessary(false)
    private String depositAcct;

    /**
     * 交易所在地区编号
     */
    @Type(DataType.A)
    @Length(4)
    @Necessary(false)
    private Integer regionCode;

    /**
     * 投资人学历
     *
     * @see com.noob.fund.enums.EducationLevelEnum
     */
    @Type(DataType.C)
    @Length(3)
    @Necessary(false)
    private String educationLevel;

    /**
     * 投资人 E-MAIL 地址
     */
    @Type(DataType.C)
    @Length(40)
    @Necessary(false)
    private String emailAddress;

    /**
     * 投资人传真号码
     */
    @Type(DataType.C)
    @Length(24)
    @Necessary(false)
    private String faxNo;

    /**
     * 投资人职业代码
     *
     * @see com.noob.fund.enums.VocationTypeEnum
     */
    @Type(DataType.C)
    @Length(3)
    @Necessary(false)
    private String vocationCode;

    /**
     * 投资人住址电话
     */
    @Type(DataType.C)
    @Length(22)
    @Necessary(false)
    private String homeTelNo;

    /**
     * 投资人年收入
     */
    @Type(DataType.N)
    @Length(8)
    @Necessary(false)
    private Long AnnualIncome;

    /**
     * 投资人手机号码
     */
    @Type(DataType.C)
    @Length(24)
    @Necessary(false)
    private String mobileTelNo;

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
     * (托管网点号码。对大集中方式的销售人,此字段与销售人代码相同。)
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(true)
    private String branchCode;

    /**
     * 投资人单位电话号码
     */
    @Type(DataType.C)
    @Length(22)
    @Necessary(false)
    private String officeTelNo;

    /**
     * 交易发生时间
     */
    @DatePattern(DateUtil.hhMMss)
    @Type(DataType.A)
    @Length(6)
    @Necessary(true)
    private Integer transactionTime;

    /**
     * 投资人户名简称
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(false)
    private String accountAbbr;

    /**
     * 密函编号
     */
    @Type(DataType.C)
    @Length(8)
    @Necessary(false)
    private String confidentialDocumentCode;

    /**
     * 投资人性别
     *
     * @see com.noob.fund.enums.SexEnum
     */
    @Type(DataType.A)
    @Length(1)
    @Necessary(false)
    private Integer sex;

    /**
     * 上交所证券账号
     */
    @Type(DataType.C)
    @Length(10)
    @Necessary(false)
    private String SHSecuritiesAccountID;

    /**
     * 深交所证券账号
     */
    @Type(DataType.C)
    @Length(10)
    @Necessary(false)
    private String SZSecuritiesAccountID;

    /**
     * 投资人基金账号
     * (账户信息修改申请时为必选项。)
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(false)
    private String TAAccountID;

    /**
     * 投资人电话号码
     */
    @Type(DataType.C)
    @Length(22)
    @Necessary(false)
    private String telNo;

    /**
     * 使用的交易手段
     * <p>
     * 共 8 个字符,每个字符代表 一种交易手段,其含义为:
     * 第 1 位:CALLCENTER
     * 第 2 位:INTERNET
     * 第 3 位:自助终端
     * 第 4 位:柜台
     * 第 5~8 位:保留
     * 每个字符取 1 表示使用此种 手段,取 0 表示不使用
     */
    @Type(DataType.C)
    @Length(8)
    @Necessary(false)
    private String tradingMethod;

    /**
     * 未成年人标志
     *
     * @see com.noob.fund.consts.MinorFlag
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String minorFlag;

    /**
     * 对账单寄送选择
     *
     * @see com.noob.fund.enums.DeliverTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String deliverType;

    /**
     * 经办人识别方式
     *
     * @see com.noob.fund.enums.RecognitionTypeEnum
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String transactorIDType;

    /**
     * 基金账户卡的凭证号
     */
    @Type(DataType.C)
    @Length(8)
    @Necessary(false)
    private String accountCardID;

    /**
     * 对账单寄送方式
     * <p>
     * 共 8 个字符,每个字符代表 一种交易手段,其含义为:
     * 第 1 位:邮寄,
     * 第 2 位:传真,
     * 第 3 位:E-mail,
     * 第 4 位:短消息,
     * 第 5~8 位:保留。
     * 每位字符取 1 表示采用此种 手段,取 0 表示不使用
     */
    @Type(DataType.C)
    @Length(8)
    @Necessary(false)
    private String deliverWay;

    /**
     * 投资者国籍(采用 GB/T 2659-2000)
     */
    @Type(DataType.C)
    @Length(3)
    @Necessary(false)
    private String nationality;

    /**
     * 操作(清算)网点编号
     */
    @Type(DataType.C)
    @Length(9)
    @Necessary(false)
    private String netNo;

    /**
     * 经纪人(客户所属的经纪人)
     */
    @Type(DataType.C)
    @Length(12)
    @Necessary(false)
    private String broker;

    /**
     * 工作单位名称
     */
    @Type(DataType.C)
    @Length(40)
    @Necessary(false)
    private String corpName;

    /**
     * 证件有效日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer certValidDate;

    /**
     * 机构经办人身份证件有效日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer instTranCertValidDate;

    /**
     * 机构法人身份证件有效日期
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(8)
    @Necessary(false)
    private Integer instReprCertValidDate;

    /**
     * 客户风险等级
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String clientRiskRate;

    /**
     * 机构法人经营范围
     */
    @Type(DataType.C)
    @Length(2)
    @Necessary(false)
    private String instReprManageRange;

    /**
     * 控股股东
     */
    @Type(DataType.C)
    @Length(80)
    @Necessary(false)
    private String controlHolder;

    /**
     * 实际控制人
     */
    @Type(DataType.C)
    @Length(80)
    @Necessary(false)
    private String actualController;

    /**
     * 婚姻状况
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String marriageStatus;

    /**
     * 家庭人口数
     */
    @Type(DataType.N)
    @Length(2)
    @Necessary(false)
    private Long familyNum;

    /**
     * 家庭资产  16(两位小数)
     */
    @Type(DataType.N)
    @Length(16)
    @Necessary(false)
    private Long penates;

    /**
     * 媒体偏好
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String mediaHobby;

    /**
     * 投资人英文名
     */
    @Type(DataType.C)
    @Length(20)
    @Necessary(false)
    private String englishFirstName;

    /**
     * 投资人英文姓
     */
    @Type(DataType.C)
    @Length(20)
    @Necessary(false)
    private String englishFamliyName;

    /**
     * 行业 (采用国标 GB/T 4754-2011)
     */
    @Type(DataType.C)
    @Length(4)
    @Necessary(false)
    private String vocation;

    /**
     * 企业性质
     */
    @Type(DataType.C)
    @Length(2)
    @Necessary(false)
    private String corpoProperty;

    /**
     * 员工人数  16(两位小数)
     */
    @Type(DataType.N)
    @Length(16)
    @Necessary(false)
    private Long staffNum;

    /**
     * 兴趣爱好类型
     */
    @Type(DataType.C)
    @Length(2)
    @Necessary(false)
    private String hobbyType;

    /**
     * 省/直辖市
     * (采用国标 GB/T 2260-2007 中 6 位数字代码)
     */
    @Type(DataType.C)
    @Length(6)
    @Necessary(false)
    private String province;

    /**
     * 市
     * (采用国标 GB/T 2260-2007 中 6 位数字代码)
     */
    @Type(DataType.C)
    @Length(6)
    @Necessary(false)
    private String city;

    /**
     * 县/区
     * (采用国标 GB/T 2260-2007 中 6 位数字代码)
     */
    @Type(DataType.C)
    @Length(6)
    @Necessary(false)
    private String county;

    /**
     * 推荐人
     */
    @Type(DataType.C)
    @Length(40)
    @Necessary(false)
    private String commendPerson;

    /**
     * 推荐人类型
     *
     * @see CommendPersonTypeEnum
     */
    @Type(DataType.C)
    @Length(40)
    @Necessary(false)
    private String commendPersonType;

    /**
     * 投资人收款银行账户户名
     */
    @Type(DataType.C)
    @Length(60)
    @Necessary(false)
    private String acctNameOfInvestorInClearingAgency;

    /**
     * 投资人收款银行账户账号
     */
    @Type(DataType.C)
    @Length(28)
    @Necessary(false)
    private String acctNoOfInvestorInClearingAgency;

    /**
     * 投资人收款银行账户开户行
     */
    @DatePattern(DateUtil.yyyyMMdd)
    @Type(DataType.A)
    @Length(9)
    @Necessary(false)
    private Integer clearingAgency;

    /**
     * 受理方式
     */
    @Type(DataType.C)
    @Length(1)
    @Necessary(false)
    private String acceptMethod;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstReprIDCode() {
        return instReprIDCode;
    }

    public void setInstReprIDCode(String instReprIDCode) {
        this.instReprIDCode = instReprIDCode;
    }

    public String getInstReprIDType() {
        return instReprIDType;
    }

    public void setInstReprIDType(String instReprIDType) {
        this.instReprIDType = instReprIDType;
    }

    public String getInstReprName() {
        return instReprName;
    }

    public void setInstReprName(String instReprName) {
        this.instReprName = instReprName;
    }

    public Integer getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(Integer appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
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

    public Integer getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Integer transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getIndividualOrInstitution() {
        return individualOrInstitution;
    }

    public void setIndividualOrInstitution(Integer individualOrInstitution) {
        this.individualOrInstitution = individualOrInstitution;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getTransactorCertNo() {
        return transactorCertNo;
    }

    public void setTransactorCertNo(String transactorCertNo) {
        this.transactorCertNo = transactorCertNo;
    }

    public String getTransactorCertType() {
        return transactorCertType;
    }

    public void setTransactorCertType(String transactorCertType) {
        this.transactorCertType = transactorCertType;
    }

    public String getTransactorName() {
        return transactorName;
    }

    public void setTransactorName(String transactorName) {
        this.transactorName = transactorName;
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

    public String getAcctNoOfFMInClearingAgency() {
        return acctNoOfFMInClearingAgency;
    }

    public void setAcctNoOfFMInClearingAgency(String acctNoOfFMInClearingAgency) {
        this.acctNoOfFMInClearingAgency = acctNoOfFMInClearingAgency;
    }

    public String getAcctNameOfFMInClearingAgency() {
        return acctNameOfFMInClearingAgency;
    }

    public void setAcctNameOfFMInClearingAgency(String acctNameOfFMInClearingAgency) {
        this.acctNameOfFMInClearingAgency = acctNameOfFMInClearingAgency;
    }

    public Integer getClearingAgencyCode() {
        return clearingAgencyCode;
    }

    public void setClearingAgencyCode(Integer clearingAgencyCode) {
        this.clearingAgencyCode = clearingAgencyCode;
    }

    public Integer getInvestorsBirthday() {
        return investorsBirthday;
    }

    public void setInvestorsBirthday(Integer investorsBirthday) {
        this.investorsBirthday = investorsBirthday;
    }

    public String getDepositAcct() {
        return depositAcct;
    }

    public void setDepositAcct(String depositAcct) {
        this.depositAcct = depositAcct;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getVocationCode() {
        return vocationCode;
    }

    public void setVocationCode(String vocationCode) {
        this.vocationCode = vocationCode;
    }

    public String getHomeTelNo() {
        return homeTelNo;
    }

    public void setHomeTelNo(String homeTelNo) {
        this.homeTelNo = homeTelNo;
    }

    public Long getAnnualIncome() {
        return AnnualIncome;
    }

    public void setAnnualIncome(Long annualIncome) {
        AnnualIncome = annualIncome;
    }

    public String getMobileTelNo() {
        return mobileTelNo;
    }

    public void setMobileTelNo(String mobileTelNo) {
        this.mobileTelNo = mobileTelNo;
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

    public String getOfficeTelNo() {
        return officeTelNo;
    }

    public void setOfficeTelNo(String officeTelNo) {
        this.officeTelNo = officeTelNo;
    }

    public Integer getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getAccountAbbr() {
        return accountAbbr;
    }

    public void setAccountAbbr(String accountAbbr) {
        this.accountAbbr = accountAbbr;
    }

    public String getConfidentialDocumentCode() {
        return confidentialDocumentCode;
    }

    public void setConfidentialDocumentCode(String confidentialDocumentCode) {
        this.confidentialDocumentCode = confidentialDocumentCode;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSHSecuritiesAccountID() {
        return SHSecuritiesAccountID;
    }

    public void setSHSecuritiesAccountID(String SHSecuritiesAccountID) {
        this.SHSecuritiesAccountID = SHSecuritiesAccountID;
    }

    public String getSZSecuritiesAccountID() {
        return SZSecuritiesAccountID;
    }

    public void setSZSecuritiesAccountID(String SZSecuritiesAccountID) {
        this.SZSecuritiesAccountID = SZSecuritiesAccountID;
    }

    public String getTAAccountID() {
        return TAAccountID;
    }

    public void setTAAccountID(String TAAccountID) {
        this.TAAccountID = TAAccountID;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(String tradingMethod) {
        this.tradingMethod = tradingMethod;
    }

    public String getMinorFlag() {
        return minorFlag;
    }

    public void setMinorFlag(String minorFlag) {
        this.minorFlag = minorFlag;
    }

    public String getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(String deliverType) {
        this.deliverType = deliverType;
    }

    public String getTransactorIDType() {
        return transactorIDType;
    }

    public void setTransactorIDType(String transactorIDType) {
        this.transactorIDType = transactorIDType;
    }

    public String getAccountCardID() {
        return accountCardID;
    }

    public void setAccountCardID(String accountCardID) {
        this.accountCardID = accountCardID;
    }

    public String getDeliverWay() {
        return deliverWay;
    }

    public void setDeliverWay(String deliverWay) {
        this.deliverWay = deliverWay;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public Integer getCertValidDate() {
        return certValidDate;
    }

    public void setCertValidDate(Integer certValidDate) {
        this.certValidDate = certValidDate;
    }

    public Integer getInstTranCertValidDate() {
        return instTranCertValidDate;
    }

    public void setInstTranCertValidDate(Integer instTranCertValidDate) {
        this.instTranCertValidDate = instTranCertValidDate;
    }

    public Integer getInstReprCertValidDate() {
        return instReprCertValidDate;
    }

    public void setInstReprCertValidDate(Integer instReprCertValidDate) {
        this.instReprCertValidDate = instReprCertValidDate;
    }

    public String getClientRiskRate() {
        return clientRiskRate;
    }

    public void setClientRiskRate(String clientRiskRate) {
        this.clientRiskRate = clientRiskRate;
    }

    public String getInstReprManageRange() {
        return instReprManageRange;
    }

    public void setInstReprManageRange(String instReprManageRange) {
        this.instReprManageRange = instReprManageRange;
    }

    public String getControlHolder() {
        return controlHolder;
    }

    public void setControlHolder(String controlHolder) {
        this.controlHolder = controlHolder;
    }

    public String getActualController() {
        return actualController;
    }

    public void setActualController(String actualController) {
        this.actualController = actualController;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public Long getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Long familyNum) {
        this.familyNum = familyNum;
    }

    public Long getPenates() {
        return penates;
    }

    public void setPenates(Long penates) {
        this.penates = penates;
    }

    public String getMediaHobby() {
        return mediaHobby;
    }

    public void setMediaHobby(String mediaHobby) {
        this.mediaHobby = mediaHobby;
    }

    public String getEnglishFirstName() {
        return englishFirstName;
    }

    public void setEnglishFirstName(String englishFirstName) {
        this.englishFirstName = englishFirstName;
    }

    public String getEnglishFamliyName() {
        return englishFamliyName;
    }

    public void setEnglishFamliyName(String englishFamliyName) {
        this.englishFamliyName = englishFamliyName;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getCorpoProperty() {
        return corpoProperty;
    }

    public void setCorpoProperty(String corpoProperty) {
        this.corpoProperty = corpoProperty;
    }

    public Long getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(Long staffNum) {
        this.staffNum = staffNum;
    }

    public String getHobbyType() {
        return hobbyType;
    }

    public void setHobbyType(String hobbyType) {
        this.hobbyType = hobbyType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCommendPerson() {
        return commendPerson;
    }

    public void setCommendPerson(String commendPerson) {
        this.commendPerson = commendPerson;
    }

    public String getCommendPersonType() {
        return commendPersonType;
    }

    public void setCommendPersonType(String commendPersonType) {
        this.commendPersonType = commendPersonType;
    }

    public String getAcctNameOfInvestorInClearingAgency() {
        return acctNameOfInvestorInClearingAgency;
    }

    public void setAcctNameOfInvestorInClearingAgency(String acctNameOfInvestorInClearingAgency) {
        this.acctNameOfInvestorInClearingAgency = acctNameOfInvestorInClearingAgency;
    }

    public String getAcctNoOfInvestorInClearingAgency() {
        return acctNoOfInvestorInClearingAgency;
    }

    public void setAcctNoOfInvestorInClearingAgency(String acctNoOfInvestorInClearingAgency) {
        this.acctNoOfInvestorInClearingAgency = acctNoOfInvestorInClearingAgency;
    }

    public Integer getClearingAgency() {
        return clearingAgency;
    }

    public void setClearingAgency(Integer clearingAgency) {
        this.clearingAgency = clearingAgency;
    }

    public String getAcceptMethod() {
        return acceptMethod;
    }

    public void setAcceptMethod(String acceptMethod) {
        this.acceptMethod = acceptMethod;
    }
}

