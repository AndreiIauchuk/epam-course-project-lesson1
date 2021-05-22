/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task8;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task8.service.FunctionService;

/**
 * Вычислить значение функции.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner numberScanner = new NumberScanner();

        System.out.print("Введите значение переменной: ");

        //Введенное пользователем число
        double insertedNumber = numberScanner.readDouble();

        //Объект класса-сервиса для вычисления заданной системы функций
        FunctionService functionService = new FunctionService();

        double functionValue =
                functionService.calculateFunctionSystem(insertedNumber);

        System.out.println("Значение функции равно " + functionValue);

    }

}
