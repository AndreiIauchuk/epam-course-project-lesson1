/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task4;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Сканнер данных, введеных пользователем из консоли
     */
    private static final Scanner consoleScanner = new Scanner(System.in);

    /**
     * Значение {@code int} введенного пользователем целого числа.
     */
    private static int insertedNumber;

    public static void main(String[] args) {
        System.out.println(checkAllInsertedNumbers());
    }

    /**
     * Проверяет, есть ли среди введенных пользователем чисел два четных
     *
     * @return true, если два введенных числа четные
     */
    private static boolean checkAllInsertedNumbers() {
        int countEvenNumbers = 0;

        readInsertedNumber("A");
        if (isInsertedNumberEven()) {
            countEvenNumbers++;
        }

        readInsertedNumber("B");
        if (isInsertedNumberEven()) {
            countEvenNumbers++;

            if (countEvenNumbers == 2) {
                return true;
            }

        }

        readInsertedNumber("C");
        if (isInsertedNumberEven()) {
            countEvenNumbers++;

            if (countEvenNumbers == 2) {
                return true;
            }

        }

        readInsertedNumber("D");
        if (isInsertedNumberEven()) {
            countEvenNumbers++;

            return countEvenNumbers == 2;
        }

        return false; //Среди чисел, введенных пользователем, нет двух четных чисел
    }

    /**
     * Проверяет, является ли введенное пользователем число четным
     *
     * @return true, если число четное
     */
    private static boolean isInsertedNumberEven() {
        return (insertedNumber % 2) == 0;
    }


    /**
     * Считывает введенное пользователем целое число {@code int}.
     *
     * @param letter буква-индекс вводимого числа
     */
    private static void readInsertedNumber(String letter) {
        System.out.println("Введите число " + letter + ": ");

        validateInsertedNumber(letter);
    }

    /**
     * Проверяет введенное пользователем целое число {@code int}.
     *
     * @param letter буква-индекс проверяемого числа
     */
    private static void validateInsertedNumber(String letter) {
        if (consoleScanner.hasNextInt()) {
            insertedNumber = consoleScanner.nextInt();

            if (letter.equals("D")) {
                consoleScanner.close(); //Закрывает поток, если пользователь ввел все четыре числа
            }

        } else {
            System.err.println("Введите целое число!");
            consoleScanner.nextLine();
            /*
             * Если пользователь вводит неверные данные,
             * вызывается метод readInsertedNumber(letter)
             * для повторной попытки ввода числа
             */
            readInsertedNumber(letter);
        }

    }

}
