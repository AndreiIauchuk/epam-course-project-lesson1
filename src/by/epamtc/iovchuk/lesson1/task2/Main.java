/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2;

import by.epamtc.iovchuk.lesson1.task2.scanner.MonthScanner;
import by.epamtc.iovchuk.lesson1.task2.scanner.YearScanner;
import by.epamtc.iovchuk.lesson1.task2.service.DaysCountService;

/**
 * Составить программу, которая по заданным году и номеру месяца
 * определяет количество дней в этом месяце и корректно
 * определялись все високосные года.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {

        DaysCountService daysCountService =
                new DaysCountService();

        MonthScanner monthScanner = new MonthScanner();
        YearScanner yearScanner = new YearScanner();

        //Введенный пользователем месяц
        int insertedMonth = monthScanner.readMonth();

        //Введенный пользователем год
        int insertedYear = yearScanner.readYear();

        int daysCount = daysCountService
                .calculateDaysCount(insertedYear, insertedMonth);

        System.out.println("В введенном Вами году и месяце " +
                daysCount + " дней");

    }

}


