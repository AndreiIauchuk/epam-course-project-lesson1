/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9;

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
     * Значение {@code double} введенного пользователем радиуса.
     */
    private static double insertedRadius;

    public static void main(String[] args) {
        if (readInsertedRadius()) {
            System.out.println("Длина окружности с введенным Вами радиусом, равна "
                    + defineCircumference());
            System.out.println("Площадь круга с введенным Вами радиусом, равна "
                    + defineCircleArea());
        }

    }

    /**
     * Считывает введенный пользователем радиус {@code double}.
     *
     * @return true, если пользователь правильно ввел радиус
     */
    private static boolean readInsertedRadius() {
        System.out.println("Введите радиус: ");

        return validateInsertedRadius();
    }

    /**
     * Проверяет введенный пользователем радиус {@code double}.
     *
     * @return true, если пользователь правильно ввел радиус
     */
    private static boolean validateInsertedRadius() {
        if (consoleScanner.hasNextDouble()) {
            insertedRadius = consoleScanner.nextDouble();
            consoleScanner.close();
            return true;
        } else {
            System.err.println("Введите число!");
            consoleScanner.nextLine();
            readInsertedRadius();
            return false;
        }
    }

    /**
     * Вычисляет длину окружности {@code double} с радиусом, введенным пользователем.
     */
    private static double defineCircumference() {
        //Длина окружности равна 2πR
        return 2 * Math.PI * insertedRadius;

    }

    private static double defineCircleArea() {
        //Площадь круга равна πR²
        return Math.PI * Math.pow(insertedRadius, 2);
    }
}
