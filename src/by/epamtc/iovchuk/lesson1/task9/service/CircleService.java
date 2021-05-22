/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9.service;

/**
 * Класс-сервис для вычисления длины окружности и площади круга.
 */
public class CircleService {

    /**
     * Вычисляет длину окружности с указанным радиусом.
     * <p>
     * Длина окружности равна {@code 2πR}
     * </p>
     */
    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Вычисляет площадь круга с указанным радиусом.
     * <p>
     * Площадь круга равна {@code πR²}.
     * </p>
     */
    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
