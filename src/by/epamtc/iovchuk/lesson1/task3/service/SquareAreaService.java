/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3.service;

import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс-сервис для вычисления площади вписанного в окружность
 * квадрата и отношения площади вписанного квадрата к площади
 * внешнего.
 */
public class SquareAreaService {

    private final Validator validator = new Validator();

    /**
     * Вычисляет площадь вписанного в окружность квадрата.
     * <p>
     * Площадь вписанного квадрата равна корню
     * квадрата площади внешнего квадрата, деленного на 2.
     * </p>
     *
     * @param outsideSquareArea площадь внешнего квадрата
     * @return площадь вписанного в окружность квадрата,
     * либо -1, если неверно указана площадь вписанного квадрата
     */
    public double calculateInsideSquareArea(double outsideSquareArea) {
        if (!validator.validateOverZero(outsideSquareArea)) {
            return -1;
        }

        return Math.sqrt(outsideSquareArea / 2);
    }

    /**
     * Вычисляет, во сколько раз площадь вписанного в окружность квадрата
     * меньше площади внешнего квадрата.
     *
     * @param insideSquareArea  площать вписанного в окружность квадрата
     * @param outsideSquareArea площать внешнего квадрата
     * @return отношение площади внешнего квадрата
     * к площади вписанного в окружность квадрата,
     * либо -1, если неверно указана одна из площадей
     */
    public int calculateDivide(double insideSquareArea,
                               double outsideSquareArea) {

        if (!validator.validateOverZero(insideSquareArea)
                || !validator.validateOverZero(outsideSquareArea)) {
            return -1;
        }

        return (int) (outsideSquareArea / insideSquareArea);
    }

}