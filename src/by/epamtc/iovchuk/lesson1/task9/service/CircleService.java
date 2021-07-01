/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9.service;

import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс-сервис для вычисления длины окружности и площади круга.
 */
public class CircleService {

    /**
     * Вычисляет длину окружности с указанным радиусом.
     * <p>
     * Длина окружности равна {@code 2πR}
     * </p>
     *
     * @return длину окружности с указанным радиусом,
     * либо -1, если указан неверный радиус
     */
    public double calculateCircumference(double radius) {
        if (!validateRadius(radius)) {
            return -1;
        }

        return 2 * Math.PI * radius;
    }

    /**
     * Вычисляет площадь круга с указанным радиусом.
     * <p>
     * Площадь круга равна {@code πR²}.
     * </p>
     *
     * @return площадь круга с указанным радиусом,
     * либо -1, если указан неверный радиус
     */
    public double calculateCircleArea(double radius) {
        if (!validateRadius(radius)) {
            return -1;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean validateRadius(double radius) {
        Validator validator = new Validator();

        return (validator.validateOverZero(radius));
    }
}
