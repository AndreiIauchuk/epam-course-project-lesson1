/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2;

import by.epamtc.iovchuk.lesson1.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task2.scanner.MonthScanner;
import by.epamtc.iovchuk.lesson1.task2.scanner.YearScanner;

import javax.xml.validation.Validator;

/**
 * Класс Main.
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

        //Сканнер для считывания месяца
        CustomScanner monthScanner = new MonthScanner();

        //Сканнер для считывания года
        CustomScanner yearScanner = new YearScanner();

        //Введенный пользователем месяц
        int insertedMonth = monthScanner.read();

        //Введенный пользователем год
        int insertedYear = yearScanner.read();

        int daysInYearMonth =
                daysInYearMonthService.count(insertedYear, insertedMonth);

        System.out.println("В введенном Вами году и месяце " +
                daysInYearMonth + " дней");

    }

}


