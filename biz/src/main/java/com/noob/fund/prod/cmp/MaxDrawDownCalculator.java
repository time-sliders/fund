package com.noob.fund.prod.cmp;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.List;

/**
 * 最大回撤计算器
 *
 * @param <M> 需要计算最大回撤的数据类型
 * @param <V> M对应的历史价值数据类型
 * @author luyun
 * @since 2017.07.12
 */
public abstract class MaxDrawDownCalculator<M, V> {

    /**
     * 计算M从startDate开始到endDate结束的［最大回撤］
     */
    public BigDecimal calculate(M m, Integer startDate, Integer endDate) {

        if (m == null || startDate == null || endDate == null) {
            return null;
        }
        Assert.isTrue(startDate < endDate, "startDate must little than endDate!");

        // 1.一次性获取所有净值信息(需要进行时间顺序排序)
        List<V> hisValueList = querySortedHisValueList(m, startDate, endDate);

        // 2.计算最大回撤
        return getMaxDrawDown(hisValueList);
    }

    /**
     * 从排序好的指定净值列表中获取最大回撤
     *
     * @param valueList 净值列表
     */
    private BigDecimal getMaxDrawDown(List<V> valueList) {
        if (CollectionUtils.isEmpty(valueList)) {
            return BigDecimal.ZERO;
        }

        BigDecimal maxValue = BigDecimal.ZERO;
        BigDecimal maxDrawDown = BigDecimal.ZERO;
        for (V v : valueList) {
            BigDecimal value = getNv(v);
            if (value == null) continue;
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
                continue;
            }

            /*
             * 计算公式:
             * MaxDrawDown = max[|(M当日之前最高价值 - M当日价值)/M当日之前最高价值|]
             */
            BigDecimal currentMaxDrawDown = maxValue
                    .subtract(value)
                    .divide(maxValue, 4, BigDecimal.ROUND_HALF_UP)
                    .abs();

            if (currentMaxDrawDown.compareTo(maxDrawDown) > 0) {
                maxDrawDown = currentMaxDrawDown;
            }
        }
        return maxDrawDown;
    }

    /**
     * 获取价值对象的可进行比较与计算的净值数据
     *
     * @param v 价值对象
     */
    protected abstract BigDecimal getNv(V v);

    /**
     * 查询M从startDate开始到endDate结束的历史净值数据
     * 包含startDate与endDate
     * 需要对数据按照发布时间进行排序
     *
     * @param startDate 开始时间
     * @param endDate   结束时间
     */
    protected abstract List<V> querySortedHisValueList(M m, Integer startDate, Integer endDate);

}
