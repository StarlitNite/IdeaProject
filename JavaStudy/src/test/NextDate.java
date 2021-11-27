package test;

import java.util.Calendar;
import java.util.Date;

public class NextDate {

    public static Date getNextDate(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.add(Calendar.DAY_OF_WEEK, 1);
        System.out.println(cal.getTime());
        return cal.getTime();
    }

    /*public static void main(String[] args) {
        getNextDate();
    }*/
}
