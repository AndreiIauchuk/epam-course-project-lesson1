/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task1;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Значение {@code int} введенного пользователем целого числа.
     */
    private static int insertedNumber;


    public static void main(String[] args) {
        if (readInsertedNumber()) {
            System.out.println("Последняя цифра квадрата числа = "
                    + calculateLastNumber(insertedNumber));
        }
    }

    /**
     * Считывает введенное пользователем целое число {@code int}.
     *
     * @return true, если пользователь ввел целое число
     */
    private static boolean readInsertedNumber() {
        System.out.println("Введите целое число: ");

        Scanner consoleScanner = new Scanner(System.in);

        return validateInsertedNumber(consoleScanner);
    }

    /**
     * Проверяет введенное пользователем целое число {@code int}.
     *
     * @param consoleScanner сканнер для считывания целого числа
     * @return true, если пользователь ввел целое число
     */
    private static boolean validateInsertedNumber(Scanner consoleScanner) {
        if (consoleScanner.hasNextInt()) {
            insertedNumber = consoleScanner.nextInt();
            consoleScanner.close();
            return true;
        } else {
            System.err.println("Введите целое число!");
            consoleScanner.close();
            return false;
        }
    }

    /**
     * Вычисляет квадрат последней цифры целого числа.
     *
     * @param insertedNumber введенное целое число
     * @return последнюю цифру квадрата целого числа
     */
    private static int calculateLastNumber(int insertedNumber) {
        int lastDigit;
        int sqrtLastDigit;

        /*
         * Берется модуль, т.к. при введенном отрицательном числе
         * возращает последнюю цифру со знаком минус
         */
        lastDigit = Math.abs(insertedNumber % 10);

        sqrtLastDigit = (int) Math.pow(lastDigit, 2) % 10;

        return sqrtLastDigit;
    }
}
