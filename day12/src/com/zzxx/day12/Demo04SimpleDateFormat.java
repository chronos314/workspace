package com.zzxx.day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo04SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String str=sf.format(date);
        System.out.println(str);

        Scanner console=new Scanner(System.in);
        String s=console.next();

        SimpleDateFormat sf1=new SimpleDateFormat("yyyyMMdd");
        Date date1=sf1.parse(s);
        System.out.println(sf.format((date1)));
    }
}
