/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task5;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task5.service.IsPerfectService;

/**
 * Составить программу, печатающую значение true, если указанное
 * высказывание является истинным, и false — в противном случае:
 * является ли целое число совершенным (сумма делителей равна самому числу).
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {

        System.out.print("Введите целое число: ");

        NumberScanner numberScanner = new NumberScanner();

        IsPerfectService isPerfectService =
                new IsPerfectService();

        //Введенное пользователем число
        long insertedNumber = numberScanner.readLong();

        System.out.println(isPerfectService.isPerfect(insertedNumber));


    }


}
