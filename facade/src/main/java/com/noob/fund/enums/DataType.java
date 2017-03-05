package com.noob.fund.enums;

/**
 * 数据类型定义
 * <p>
 * 本标准包括开放式基金监管部门规定的开放式基金相关业务规则所要求的数据。数据处理规则为:
 * a) 数字左补零右对齐,字符右补空格左对齐;
 * b) 字符不区分大小写;
 * c) 对于数据交换文件:
 * 1) 采用文本文件定长记录方式;
 * 2) 每行一条完整记录;
 * 3) 换行须用换行(OAH)、回车(ODH)字符;
 * 4) 带有小数点的数值型数据,传输时不传小数点。
 * d) 汉字信息交换按国家标准GB2312-1980和GB18030-2005执行,西文信息交换按国家标准GB/T 1988-1998执行。
 *
 * @author luyun
 * @since 2017.03.03
 */
public enum DataType {

    /**
     * 字符型
     */
    C,

    /**
     * 数字字符型,限于 0—9
     */
    A,

    /**
     * 数值型,其长度不包含小数点,可参与数值计算
     */
    N,

    /**
     * 不定长文本
     */
    TEXT;

}