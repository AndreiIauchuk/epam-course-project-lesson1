/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task2;

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
     * Значение {@code int} введенного пользователем целого числа,
     * характеризующего год.
     */
    private static int insertedYear;

    /**
     * Значение {@code int} введенного пользователем целого числа,
     * характеризующего номер месяца.
     */
    private static int insertedMonth;

    /**
     * Массив целых чисел {@code int}, характеризующих количество дней
     * в каждом месяце не високосного года.
     */
    private final static int[] daysInMonth = new int[12];

    static {
        daysInMonth[0] = 31; //кол-во дней в январе
        daysInMonth[1] = 28; //кол-во дней в феврале в невисокосный год
        daysInMonth[2] = 31; //кол-во дней в марте
        daysInMonth[3] = 30; //кол-во дней в апреле
        daysInMonth[4] = 31; //кол-во дней в мае
        daysInMonth[5] = 30; //кол-во дней в июне
        daysInMonth[6] = 31; //кол-во дней в июле
        daysInMonth[7] = 31; //кол-во дней в августе
        daysInMonth[8] = 30; //кол-во дней в сентябре
        daysInMonth[9] = 31; //кол-во дней в октябре
        daysInMonth[10] = 30; //кол-во дней в ноябре
        daysInMonth[11] = 31; //кол-во дней в декабре
    }

    public static void main(String[] args) {
        if (readYear() && (readMonth())) {
            System.out.println("В введенном Вами году и номере месяца "
                    + countDaysInMonthOfYear() + " дней");
        }
    }

    /**
     * Считывает введенное пользователем целое число {@code int},
     * характеризующее год.
     *
     * @return true, если пользователь ввел год
     */
    private static boolean readYear() {
        System.out.println("Введите год: ");

        return validateInsertedYear();
    }

    /**
     * Проверяет, является ли введенное пользователем целое число {@code int} годом.
     *
     * @return true, если пользователь ввел год
     */
    private static boolean validateInsertedYear() {
        if (consoleScanner.hasNextInt()) {
            insertedYear = consoleScanner.nextInt();

            if (insertedYear > 0) {
                return true;
            } else {
                System.err.println("Год не может быть отрицательным числом или нулем!");
                consoleScanner.close();
                return false;
            }

        } else {
            System.err.println("Введите целое число!");
            consoleScanner.close();
            return false;
        }
    }

    private static boolean readMonth() {
        System.out.println("Введите месяц: ");

        return validateInsertedMonth();
    }

    /**
     * Проверяет, является ли введенное пользователем целое число {@code int} годом.
     *
     * @return true, если пользователь правильно ввел год
     */
    private static boolean validateInsertedMonth() {
        if (consoleScanner.hasNextInt()) {
            insertedMonth = consoleScanner.nextInt();

            if (insertedMonth > 0) {

                if (insertedMonth <= 12) {
                    consoleScanner.close();
                    return true;
                } else {
                    System.err.println("Номер месяца не может быть больше 12!");
                    consoleScanner.close();
                    return false;
                }

            } else {
                System.err.println("Номер месяца не может меньше единицы!");
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
     * Возвращает количество дней {@code int} в году
     * и номере месяца, введенном пользователем.
     *
     * @return количество дней
     */
    private static int countDaysInMonthOfYear() {
        for (int monthIndex = 0; monthIndex < daysInMonth.length; monthIndex++) {

            System.out.println("monthIndex = " + monthIndex);

            if ((insertedMonth - 1) == monthIndex) {

                if ((insertedYear % 4) != 0) { //Не високосный год
                    return daysInMonth[monthIndex];
                } else { //Високосный год

                    if (insertedMonth != 2) { //Не является ли введенный месяц февралем
                        return daysInMonth[monthIndex];
                    } else {
                        return daysInMonth[monthIndex] + 1;
                    }

                }
            }
        }

        return -1;
    }

}


