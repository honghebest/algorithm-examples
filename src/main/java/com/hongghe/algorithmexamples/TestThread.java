package com.hongghe.algorithmexamples;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

import com.google.common.primitives.Ints;

/**
 * @author hongghe 2018/11/25
 */
public class TestThread {

    public static void main(String[] args) {
        SimpleDateFormat format =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        String startTime = "2018-11-16 00:00:00";
        try {
            Date date = format.parse(startTime);
            int now = Ints.checkedCast(System.currentTimeMillis()/1000);
            System.out.println(now);
            System.out.println(date.getTime()/1000);
            if (now > date.getTime()/1000) {
                System.out.println("sda");
            } else {
                System.out.println("sd123123a");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer getCurrentTimestamp() {
        DateTime dateTime = new DateTime();
        return dateTime.getDayOfWeek();
    }
}
