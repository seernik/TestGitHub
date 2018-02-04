package com.company.lesson13;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class Dayz {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1986,12,19);
        System.out.println(calendar.getTimeInMillis());
        System.out.println("Месяц " + calendar.MONTH);
        System.out.println("Год " + calendar.YEAR);
        System.out.println("Неделя в месяце "
                + calendar.get(WEEK_OF_MONTH));
        System.out.println("Неделя в году "
                + calendar.get(WEEK_OF_YEAR));
        System.out.println("День в году " + calendar.get(DAY_OF_YEAR));
        System.out.println("День в месяце "
                + calendar.get(DAY_OF_MONTH));
        if (MONDAY == calendar.getFirstDayOfWeek()) {
            System.out.println("Первый день недели - Понедельник");
        }
    }
}
