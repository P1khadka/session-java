package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

class Predefined {
    public static void main(String[] args) {
        Date date = new Date(123, 1, 1);
        System.out.println(date);
        Date date1 = new Date(122, 1, 1);
        System.out.println(date1);
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate1=LocalDate.of(2022,Month.APRIL, 03);
        System.out.println(localDate1);
        Calendar now= Calendar.getInstance();
        System.out.println(now);
        now.set(1994,02, 03);
        System.out.println(now);


    }
}