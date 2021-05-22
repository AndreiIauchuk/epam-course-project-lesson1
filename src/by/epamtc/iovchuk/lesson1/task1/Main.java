/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task1;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task1.service.LastNumberSquareService;

/**
 * Написать программу, позволяющую по последней цифре числа
 * определить последнюю цифру его квадрата.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {
        System.out.print("Введите целое число: ");

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner numberScanner = new NumberScanner();

        /*
         * Объект класса-сервиса для вычисления последней
         * цифры квадрата числа
         */
        LastNumberSquareService lastNumberSquareService
                = new LastNumberSquareService();

        //Введенное пользователем целое число
        int insertedNumber = numberScanner.readInt();

        System.out.println("Последняя цифра квадрата числа = "
                + lastNumberSquareService.calculate(insertedNumber));
    }


}
