/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task8.service;

/**
 * Класс-сервис для вычисления заданной системы функций.
 */
public class FunctionService {

    /**
     * Вычисляет значение системы функций.
     *
     * @return значение системы функций.
     */
    public double calculateFunctionSystem(double number) {
        if (number >= 3) {
            return calculateFirstFunction(number);
        } else {
            return calculateSecondFunction(number);
        }
    }

    /**
     * Вычисляет значение первой функции
     * для указанной переменной
     *
     * @param number значение переменной функции
     * @return значение первой функции
     */
    private double calculateFirstFunction(double number) {
        return
                -(Math.pow(number, 2)) + 3 * number + 9;

    }

    /**
     * Вычисляет значение второй функции
     * для указанной переменной.
     *
     * @param number значение переменной функции
     * @return значение второй функции
     */
    private double calculateSecondFunction(double number) {
        return
                1 / (Math.pow(number, 3) - 6);
    }
}
