/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task2.scanner.MonthScanner;
import by.epamtc.iovchuk.lesson1.task2.scanner.YearScanner;
import by.epamtc.iovchuk.lesson1.task2.service.DaysInYearMonthService;

/**
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {
        /*
         * Класс-сервис для вычисления количества дней
         * в году и месяце, введенных пользователем
         */
        DaysInYearMonthService daysInYearMonthService =
                new DaysInYearMonthService();

        /*
         * Объект класса MonthScanner для считывания
         * из консоли месяца, введенного пользователем
         */
        CustomScanner monthScanner = new MonthScanner();

        /*
         * Объект класса YearScanner для считывания
         * из консоли года, введенного пользователем
         */
        CustomScanner yearScanner = new YearScanner();

        //Введенный пользователем месяц
        int insertedMonth = monthScanner.readInt();

        //Введенный пользователем год
        int insertedYear = yearScanner.readInt();

        int daysInYearMonth =
                daysInYearMonthService.calculate(insertedYear, insertedMonth);

        System.out.println("В введенном Вами году и месяце " +
                daysInYearMonth + " дней");

    }

}


