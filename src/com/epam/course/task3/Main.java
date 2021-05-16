/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task3;

import java.util.Scanner;

/**
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    /**
     * Значение {@code double} введенного пользователем числа,
     * характеризующего площадь внешнего квадрата.
     */
    private static double outsideSquareArea;


    public static void main(String[] args) {
        //Радиус вписанной в квадрат окружности
        double diagonalLength;

        //Площадь вписанного в окружность квадрата
        double insideSquareArea;

        if (readSquareArea()) {
            diagonalLength = defineCircleDiagonalLength();
            insideSquareArea = defineInsideSquareArea(diagonalLength);
            System.out.println("Площадь квадрата, вписанного в окружность, равна "
                    + insideSquareArea);
            System.out.println("Площадь вписанного в окружность квадрата меньше " +
                    "площади внешнего квадрата в " + defineDiv(insideSquareArea) + " раз");
        }

    }

    /**
     * Считывает введенное пользователем число {@code double},
     * характеризующее площадь внешнего квадрата.
     *
     * @return true, если пользователь ввел площадь квадрата
     */
    private static boolean readSquareArea() {
        System.out.println("Введите площадь внешнего квадрата: ");

        Scanner consoleScanner = new Scanner(System.in);

        return validateInsertedSquareArea(consoleScanner);

    }

    /**
     * Проверяет, является ли введенное пользователем число {@code double} площадью квадрата.
     *
     * @param consoleScanner сканнер для считывания площади квадрата
     * @return true, если пользователь правильно ввел площадь квадрата
     */
    private static boolean validateInsertedSquareArea(Scanner consoleScanner) {
        if (consoleScanner.hasNextDouble()) {
            outsideSquareArea = consoleScanner.nextDouble();

            if (outsideSquareArea > 0) {
                consoleScanner.close();
                return true;
            } else {
                System.err.println("Площадь квадрата не может быть отрицательным числом!");
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
     * Вычисляет диамерт {@code double} вписанной в квадрат окружности.
     *
     * @return диаметр вписанной в квадрат окружности,
     * равный длине стороны квадрата
     */
    private static double defineCircleDiagonalLength() {
        return Math.sqrt(outsideSquareArea);
    }

    /**
     * Вычисляет площадь {@code double} вписанного в окружность квадрата.
     *
     * @param diagonalLength длина диагонали квадрата
     * @return площадь вписанного квадрата,равной корню
     * квадрата диагонали данного квадрата,
     * деленного на 2
     */
    private static double defineInsideSquareArea(double diagonalLength) {
        return Math.sqrt(Math.pow(diagonalLength, 2) / 2);
    }

    /**
     * Вычисляет, во сколько раз площадь вписанного в окружность квадрата
     * меньше площади внешнего квадрата.
     *
     * @param insideSquareArea площать вписанного в окружность квадрата
     * @return во сколько раз площадь вписанного в окружность квадрата
     * меньше площади внешнего квадрата
     */
    private static double defineDiv(double insideSquareArea) {
        return outsideSquareArea / insideSquareArea;

    }

}
