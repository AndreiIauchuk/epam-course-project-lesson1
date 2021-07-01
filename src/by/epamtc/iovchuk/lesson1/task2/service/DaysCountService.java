/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.service;

import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс-сервис для вычисления количества дней
 * в году и месяце, введенных пользователем.
 */
public class DaysCountService {

    private final Validator validator = new Validator();

    private final static int MIN_MONTH_NUMBER = 1;

    private final static int MAX_MONTH_NUMBER = 12;

    /**
     * Массив целых чисел {@code int}, характеризующих количество дней
     * в каждом месяце не високосного года.
     */
    private final int[] daysInMonth = new int[13];

    {
        daysInMonth[1] = 31; //кол-во дней в январе
        daysInMonth[2] = 28; //кол-во дней в феврале в невисокосный год
        daysInMonth[3] = 31; //кол-во дней в марте
        daysInMonth[4] = 30; //кол-во дней в апреле
        daysInMonth[5] = 31; //кол-во дней в мае
        daysInMonth[6] = 30; //кол-во дней в июне
        daysInMonth[7] = 31; //кол-во дней в июле
        daysInMonth[8] = 31; //кол-во дней в августе
        daysInMonth[9] = 30; //кол-во дней в сентябре
        daysInMonth[10] = 31; //кол-во дней в октябре
        daysInMonth[11] = 30; //кол-во дней в ноябре
        daysInMonth[12] = 31; //кол-во дней в декабре
    }

    /**
     * Возвращает количество дней {@code int}
     * в указанном году и месяце.
     *
     * @return количество дней в указанном году и месяце,
     * либо -1, если неверно указан год или месяц
     */
    public int calculateDaysCount(int year, int month) {

        if (!validator.validateOverOrEqualsZero(year)
                || !validator.validateOverOrEqualsMin(month, MIN_MONTH_NUMBER)
                || !validator.validateLessOrEqualsMax(month, MAX_MONTH_NUMBER)) {

            return -1;
        }

        if (checkLeapYear(year)) {
            return defineLeapYearDaysCount(month);
        }

        return daysInMonth[month];
    }

    private boolean checkLeapYear(int year) {
        return (year != 0) && (year % 4) == 0;
    }

    private int defineLeapYearDaysCount(int month) {
        if (isFebruary(month)) {
            return daysInMonth[month] + 1;
        }

        return daysInMonth[month];
    }

    private boolean isFebruary(int month) {
        return (month == 2);
    }
}
