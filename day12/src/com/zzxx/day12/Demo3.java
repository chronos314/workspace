package com.zzxx.day12;

import java.util.Calendar;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int month=cal.get(Calendar.MONTH);
        System.out.println("month:"+month);
        int year=cal.get(Calendar.YEAR);
        System.out.println("year:"+year);
/*        cal.add(Calendar.DATE,7);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.DATE,48);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.YEAR,10);
        cal.set(Calendar.WEEK_OF_MONTH,3);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));*/
        Date date3=cal.getTime();
        Date date4=new Date(0);
        cal.setTime(date4);
        int year2=cal.get(Calendar.YEAR);
        System.out.println("year:"+year2);

    }
}
