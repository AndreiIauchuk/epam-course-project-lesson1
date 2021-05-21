/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task1;

import by.epamtc.iovchuk.lesson1.scanner.ConsoleNumberScanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");

        /*
         * Объект класса-оболочки ConsoleScanner для считывания
         * из консоли целого числа, введенного пользователем
         */
        ConsoleNumberScanner consoleScanner = new ConsoleNumberScanner();

        /*
         * Объект класса-сервиса для вычисления последней
         * цифры квадрата числа
         */
        LastNumberSquareService lastNumberSquareService = new LastNumberSquareService();

        //Введенное пользователем целое число
        int insertedNumber = consoleScanner.read();

        System.out.println("Последняя цифра квадрата числа = "
                + lastNumberSquareService.calculate(insertedNumber));
    }


}
