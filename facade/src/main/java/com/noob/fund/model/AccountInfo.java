package com.noob.fund.model;

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
 * 账户信息
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

}
