/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2;

/**
 * Класс-сервис для вычисления количества дней
 * в году и месяце, введенных пользователем.
 */
public class DaysInYearMonthService {

    /**
     * Массив целых чисел {@code int}, характеризующих количество дней
     * в каждом месяце не високосного года.
     */
    private final static int[] daysInMonth = new int[12];

    static {
        daysInMonth[0] = 31; //кол-во дней в январе
        daysInMonth[1] = 28; //кол-во дней в феврале в невисокосный год
        daysInMonth[2] = 31; //кол-во дней в марте
        daysInMonth[3] = 30; //кол-во дней в апреле
        daysInMonth[4] = 31; //кол-во дней в мае
        daysInMonth[5] = 30; //кол-во дней в июне
        daysInMonth[6] = 31; //кол-во дней в июле
        daysInMonth[7] = 31; //кол-во дней в августе
        daysInMonth[8] = 30; //кол-во дней в сентябре
        daysInMonth[9] = 31; //кол-во дней в октябре
        daysInMonth[10] = 30; //кол-во дней в ноябре
        daysInMonth[11] = 31; //кол-во дней в декабре
    }

    /**
     * Возвращает количество дней {@code int}
     * в году и месяце, введенных пользователем.
     *
     * @return количество дней
     */
    public int count(int year, int month) {
        for (int monthIndex = 0; monthIndex < daysInMonth.length; monthIndex++) {

            if ((month - 1) == monthIndex) {

                //Если указанный год не високосный
                if ((year % 4) != 0) {
                    //Возвращает количество дней в указанном месяце
                    return daysInMonth[monthIndex];
                }
                //Если указанный год високосный
                else {
                    //Если указанный месяц - февраль високосного года
                    if (month != 2) {
                        //Возращает количество дней в феврале високосного года
                        return daysInMonth[monthIndex];
                    }
                    //Если указанный месяц - февраль високосного года
                    else {
                        //Возращает количество дней в феврале високосного года + 1
                        return daysInMonth[monthIndex] + 1;
                    }

                }
            }
        }

        return -1;
    }
}
