/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Значение {@code int} введенного пользователем целого числа,
     * характеризующего секунду.
     */
    private static int insertedSecond;

    /**
     * Значение целого числа {@code short},
     * характеризующего прошедшие часы.
     */
    private static short pastHours;

    /**
     * Значение целого числа {@code short},
     * характеризующего прошедшие минуты.
     */
    private static short pastMinutes;

    /**
     * Значение целого числа {@code short},
     * характеризующего прошедшие секунды.
     */
    private static short pastSeconds;

    /**
     * Количество секунд {@code int} в одних сутках.
     */
    private final static int secondsInOneDay = 86400;

    /**
     * Количество секунд {@code short} в одном часе.
     */
    private final static short secondsInOneHour = 3600;

    /**
     * Количество секунд {@code short} в одной минуте.
     */
    private final static short secondsInOneMinute = 60;

    public static void main(String[] args) {

        if (readSecond()) {
            calculatePastTime();
            System.out.println("К введенной Вами секунде прошло: \n"
                    + pastHours + " часов, \n"
                    + pastMinutes + " минут, \n"
                    + pastSeconds + " секунд"
            );

        }

    }

    /**
     * Считывает введенное пользователем целое число {@code int},
     * характеризующее секунду.
     *
     * @return true, если пользователь ввел секунду
     */
    private static boolean readSecond() {
        System.out.println("Введите секунду: ");

        Scanner consoleScanner = new Scanner(System.in);

        return validateInsertedSecond(consoleScanner);
    }

    /**
     * Проверяет, является ли введенное пользователем целое число {@code int} секундой.
     *
     * @return true, если пользователь ввел секунду
     */
    private static boolean validateInsertedSecond(Scanner consoleScanner) {
        if (consoleScanner.hasNextInt()) {
            insertedSecond = consoleScanner.nextInt();

            if (insertedSecond >= 0) {

                if (insertedSecond <= secondsInOneDay) {
                    consoleScanner.close();
                    return true;
                } else {
                    System.err.println("В сутках не более 86400 секунд!");
                    consoleScanner.close();
                    return false;
                }

            } else {
                System.err.println("Секунда не может быть отрицательным числом!");
                consoleScanner.close();
                return false;
            }

        } else {
            System.err.println("Введите целое число!");
            consoleScanner.close();
            return false;
        }
    }

    /**
     * Вычисляет количество часов, минут и секунд,
     * пройденных к моменту введенной пользователем секунды
     */
    private static void calculatePastTime() {
        short secondsAfterDefineHours;
        short secondsAfterDefineMinutes;

        secondsAfterDefineHours = definePastHours();
        secondsAfterDefineMinutes = definePastMinutes(secondsAfterDefineHours);
        definePastSeconds(secondsAfterDefineMinutes);
    }

    /**
     * Вычисляет количество пройденных часов {@code short}.
     *
     * @return количество оставшихся секунд
     */
    private static short definePastHours() {
        pastHours = (short) (insertedSecond / secondsInOneHour);
        return (short) (insertedSecond % secondsInOneHour);
    }

    /**
     * Вычисляет количество пройденных минут {@code short}.
     *
     * @param remainingSeconds количество секунд, оставшихся после вычисленного
     *                         количества часов
     * @return количество секунд, оставшихся  после вычисления количества минут
     */
    private static short definePastMinutes(short remainingSeconds) {
        pastMinutes = (short) (remainingSeconds / secondsInOneMinute);
        return (short) (remainingSeconds % secondsInOneMinute);
    }

    /**
     * Вычисляет количество пройденных секунд {@code short}.
     *
     * @param remainingSeconds количество секунд, оставшихся после вычисленного
     *                         количества часов и минут
     */
    private static void definePastSeconds(short remainingSeconds) {
        pastSeconds = remainingSeconds;
    }
}
