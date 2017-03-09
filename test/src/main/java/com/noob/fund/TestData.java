package com.noob.fund;

import com.noob.storage.utils.DateUtil;

import java.util.Date;

/**
 *
 * @author luyun
 * @since 2017.03.09
 */
public class TestData {


    /*
    201702141N1N201702140000009882,2017-02-15 10:20:54,2017-02-15,b431392731bc4e229c826afa16c1e876,143,红利发放,0.00,0.00,6222021302025179648,002,2,160605,0,,0,1,0,,2017-02-15,0.00,0.01,1.0000,0.00
    201702141N1N201702140000009882,2017-02-15 10:20:54,2017-02-15,b431392731bc4e229c826afa16c1e876,143,红利发放,0.00,0.00,6222021302025179648,002,2,160605,0,,0,1,0,,2017-02-15,0.00,0.01,1.0000,0.00
    201702141N1N201702140000012237,2017-02-15 10:20:43,2017-02-15,b431392731bc4e229c826afa16c1e876,142,强行赎回,0.00,0.00,6222021302025179648,002,2,160605,0,,0,1,0,,2017-02-15,1.76,1.76,1.0000,0.00
    201702149999170214303000515264,2017-02-15 14:25:58,2017-02-15,b431392731bc4e229c826afa16c1e876,144,强行调增,0.00,0.00,6222021302025179648,002,2,160605,0,,0,1,0,,2017-02-15,0.00,0.01,0.0000,0.00
    */
    private static String DIVIDEND_MONEY = "%s,%s,%s,b431392731bc4e229c826afa16c1e876,143,红利发放,0.00,0.00,6222021302025179648,002,2,160605,0,,0,1,0,,%s,0.00,0.01,1.0000,0.00";

    public static void main(String[] args) {

        Date date = new Date();
        String default_format_date = DateUtil.format(date, DateUtil.DEFAULT_FORMAT);
        String short_date_format = DateUtil.format(date, DateUtil.yyyy_MM_dd);
        String dividends = String.format(DIVIDEND_MONEY, generateAPPLYNO(),default_format_date,short_date_format,short_date_format);

    }

    private static String generateAPPLYNO() {
        return String.valueOf(System.currentTimeMillis());
    }


}
