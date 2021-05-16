/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task5;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Значение {@code long} введенного пользователем целого числа.
     */
    private static long insertedNumber;

    public static void main(String[] args) {
        //Сумма делителей числа
        long dividersSum;

        if (readInsertedNumber()) {
            dividersSum = defineDividersSum();
            System.out.println(isPerfectNumber(dividersSum));
        }

    }

    /**
     * Считывает введенное пользователем целое число {@code long}.
     *
     * @return true, если пользователь правильно ввел число
     */
    private static boolean readInsertedNumber() {
        System.out.println("Введите целое число: ");

        Scanner consoleScanner = new Scanner(System.in);

        return validateInsertedNumber(consoleScanner);
    }

    /**
     * Проверяет введенное пользователем целое число {@code long}.
     *
     * @param consoleScanner сканнер для считывания целого числа
     * @return true, если пользователь правильно ввел число
     */
    private static boolean validateInsertedNumber(Scanner consoleScanner) {
        if (consoleScanner.hasNextLong()) {
            insertedNumber = consoleScanner.nextLong();
            consoleScanner.close();
            return true;
        } else {
            System.err.println("Введите целое число!");
            consoleScanner.close();
            return false;
        }

    }

    /**
     * Вычислет сумму делителей введенного пользователем числа {@code long}
     *
     * @return сумму делителей числа
     */
    private static long defineDividersSum() {
        /*
         * Сумма делителей введенного числа. Изначально равна единице,
         * т.к. любое число при делении самого на себя равно единице
         */
        long dividersSum = 1;

        /*
         * Максимально возможный делитель числа, равный половине
         * указанного числа
         */
        long maxDivider = insertedNumber / 2;

        for (long divider = 2; divider <= maxDivider; divider++) {
            if ((insertedNumber % divider) == 0) {
                dividersSum += divider;
            }
        }

        return dividersSum;
    }


    /**
     * Проверяет, является ли введенное число совершенным
     *
     * @param dividersSum сумма делителей введенного числа
     * @return true, если число совершенное
     */
    private static boolean isPerfectNumber(long dividersSum) {
        return (dividersSum == insertedNumber);

    }
}
