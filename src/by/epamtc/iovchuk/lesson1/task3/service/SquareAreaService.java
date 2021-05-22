/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3.service;

/**
 * Класс-сервис для вычисления площади вписанного в окружность
 * квадрата и отношения площади вписанного квадрата к площади
 * внешнего.
 */
public class SquareAreaService {

    /**
     * Вычисляет площадь вписанного в окружность квадрата.
     * <p>
     * Площадь вписанного квадрата равна корню
     * квадрата диагонали окружности, деленного на 2.
     * </p>
     *
     * @param outsideSquareArea площадь внешнего квадрата
     * @return площадь вписанного в окружность квадрата
     */
    public double calculateInsideSquareArea(double outsideSquareArea) {
        //Диагональ вписанной в квадрат окружности
        double diagonalLength = Math.sqrt(outsideSquareArea);

        return Math.sqrt(Math.pow(diagonalLength, 2) / 2);
    }

    /**
     * Вычисляет, во сколько раз площадь вписанного в окружность квадрата
     * меньше площади внешнего квадрата.
     *
     * @param insideSquareArea площать вписанного в окружность квадрата
     * @param outsideSquareArea площать внешнего квадрата
     * @return во сколько раз площадь вписанного в окружность квадрата
     * меньше площади внешнего квадрата
     */
    public double calculateDivide(double insideSquareArea,
                                  double outsideSquareArea) {

        return outsideSquareArea / insideSquareArea;
    }

}
