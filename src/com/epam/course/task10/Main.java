/*
 * Copyright (c) 2021. All rights reserved.
 */

package com.epam.course.task10;

import java.util.LinkedHashMap;
import java.util.Map;
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

  /*  **
     * Значение {@code double} введенной пользователем точки на отрезке.
     *//*
    private static double insertedPointOfSegment;*/

    /**
     * Значение {@code double} введенного пользователем начала отрезка [a,b].
     */
    private static double startOfSegment;

    /**
     * Значение {@code double} введенного пользователем конца отрезка [a,b].
     */
    private static double endOfSegment;

    /**
     * Значение {@code double} введенного пользователем шага отрезка [a,b].
     */
    private static double insertedSegmentStep;

    /**
     * Map<>, содержащий информацию об значении аргументов и значениях функции.
     * <p>
     * {@code ключ -} значение аргумента;
     * </p>
     * <p>
     * {@code значение -} значение функции.
     * </p>
     */
    private static final Map<Double, Double> functionValuesMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        readSegmentPointsAndStep();
        fillFunctionValuesMap();
        drawTable();

    }

    /**
     * Считывает начало и конец отрезка [a,b].
     */
    private static void readSegmentPointsAndStep() {
        readSegmentPoint("a");
        readSegmentPoint("b");
        readSegmentStep();
        consoleScanner.close();
    }

    /**
     * Считывает введенную пользователем точку на отрезке {@code double}.
     *
     * @param letter буква-индекс точки на отрезке
     * @return true, если пользователь правильно ввел точку на отрезке
     */
    private static void readSegmentPoint(String letter) {
        System.out.println("Введите точку " + letter
                + " на отрезке [a,b]:");

        validateInsertedSegmentPoint(letter);
    }

    /**
     * Проверяет, является ли введенное пользователем число
     * {@code double} точкой на отрезке.
     *
     * @param letter буква-индекс проверяемой точки на отрезке
     */
    private static void validateInsertedSegmentPoint(String letter) {
        if (consoleScanner.hasNextDouble()) {
            //Введенное пользователем значение
            double insertedValue = consoleScanner.nextDouble();

            if (letter.equals("b")) {

                if (insertedValue > startOfSegment) {
                    endOfSegment = insertedValue;
                } else {
                    System.err.println("Значение конца отрезка должно быть больше " +
                            "значения начала отрезка!");
                    rescanSegmentPoint(letter);
                }

            } else {
                startOfSegment = insertedValue;
            }

        } else {
            System.err.println("Введите число!");
            rescanSegmentPoint(letter);
        }
    }

    /**
     * Вызывает метод {@code readSegmentPoint(letter)}
     * для повторной попытки ввода точки на отрезке,
     * если пользователь вводит неверные данные.
     *
     * @param letter буква-индекс точки на отрезке
     *               для повторного ввода
     */
    private static void rescanSegmentPoint(String letter) {
        consoleScanner.nextLine();
        readSegmentPoint(letter);
    }

    /**
     * Считывает введенную пользователем шаг на отрезке {@code double}.
     *
     * @return true, если пользователь правильно ввел точку на отрезке
     */
    private static void readSegmentStep() {
        System.out.println("Введите шаг на отрезке [a,b]:");

        validateInsertedSegmentStep();
    }

    /**
     * Проверяет, является ли введенное пользователем число
     * {@code double} шагом на отрезке.
     */

    private static void validateInsertedSegmentStep() {
        if (consoleScanner.hasNextDouble()) {
            //Введенное пользователем значение
            double insertedValue = consoleScanner.nextDouble();

            if (insertedValue > 0) {
                insertedSegmentStep = insertedValue;
            } else {
                System.err.println("Шаг не может быть отрицательным числом или нулем!");
                rescanSegmentStep();
            }

        } else {
            System.err.println("Введите число!");
            rescanSegmentStep();
        }
    }

    /**
     * Вызывает метод {@code readSegmentPoint(letter)}
     * для повторной попытки ввода шага на отрезке,
     * если пользователь вводит неверные данные.
     */
    private static void rescanSegmentStep() {
        consoleScanner.nextLine();
        readSegmentStep();
    }

    /**
     * Заполняет {@code functionValuesMap} значениями.
     */
    private static void fillFunctionValuesMap() {

        for (double pointOnSegment = startOfSegment;
             pointOnSegment <= endOfSegment;
             pointOnSegment = pointOnSegment + insertedSegmentStep) {

            functionValuesMap.put(pointOnSegment, defineFunctionValue(pointOnSegment));

        }
    }

    /**
     * Вычисляет значение функции {@code tg(x)).
     *
     * @param value значение аргумента
     * @return значение функции {@code double}
     */
    private static double defineFunctionValue(double value) {
        return Math.tan(value);
    }

    /**
     * Рисует таблицу, где:
     * <p>
     * {@code первый слобец -} значение введенного пользователем аргумента;
     * </p>
     * <p>
     * {@code второй - } значение функции.
     * </p>
     */
    private static void drawTable() {
        functionValuesMap.forEach(((value, functionValue) ->
                System.out.println(value + " | " + functionValue)));
    }
}
