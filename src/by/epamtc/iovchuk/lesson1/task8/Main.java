/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task8;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Сканнер данных, введеных пользователем из консоли.
     */
    private static final Scanner consoleScanner = new Scanner(System.in);

    /**
     * Значение {@code double} введенного пользователем целого числа.
     */
    private static double insertedNumber;

    public static void main(String[] args) {
        double functionSystemValue;

        if (readInsertedNumber()) {
            functionSystemValue = defineFunctionSystem();
            System.out.println("Значение функции равно: " + functionSystemValue);
        }

    }

    /**
     * Считывает введенное пользователем целое число {@code double}.
     *
     * @return true, если пользователь правильно ввел число
     */
    private static boolean readInsertedNumber() {
        System.out.println("Введите целое число: ");

        return validateInsertedNumber();
    }

    /**
     * Проверяет введенное пользователем целое число {@code double}.
     *
     * @return true, если пользователь правильно ввел число
     */
    private static boolean validateInsertedNumber() {
        if (consoleScanner.hasNextDouble()) {
            insertedNumber = consoleScanner.nextDouble();
            consoleScanner.close();
            return true;
        } else {
            System.err.println("Введите целое число!");
            rescanNumber();
            return false;
        }

    }

    /**
     * Вызывает метод {@code readInsertedNumber(letter)}
     * для повторной попытки ввода значения x,
     * если пользователь вводит неверные данные.
     *
     */
    private static void rescanNumber() {
        consoleScanner.nextLine();
        readInsertedNumber();
    }

    /**
     * Вычисляет значение системы функции {@code double}
     *
     * @return значение системы функции
     */
    private static double defineFunctionSystem() {
        if (insertedNumber >= 3) {
            return defineFirstFunction();
        } else {
            return defineSecondFunction();
        }
    }

    /**
     * Вычисляет значение первой функции {@code double}, если {@code x ≥ 3}
     *
     * @return значение первой функции
     */
    private static double defineFirstFunction() {
        return
                -(Math.pow(insertedNumber, 2)) + 3 * insertedNumber + 9;

    }

    /**
     * Вычисляет значение второй функции {@code double}, если {@code x < 3}
     *
     * @return значение второй функции
     */
    private static double defineSecondFunction() {
        return
                1 / (Math.pow(insertedNumber, 3) - 6);
    }
}
