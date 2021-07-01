/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7.service;

import by.epamtc.iovchuk.lesson1.exception.NullException;
import by.epamtc.iovchuk.lesson1.task7.entity.Point;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс-сервис для определения ближайшей к
 * началу координат точки
 */
public class ClosestPointService {

    /**
     * Определяет из двух указанных точек ближайшую к началу координат.
     *
     * @param pointA точка А для сравнения
     * @param pointB точка B для сравнения
     * @return ближайшую к началу координат точку, либо
     * null, если одна из ссылочных переменных указывает на null
     */
    public Point defineClosestPoint(Point pointA, Point pointB)
            throws NullException {

        Validator validator = new Validator();

        if (!validator.validateNotNull(pointA)
        || !validator.validateNotNull(pointB)) {
            throw new NullException("Точка");
        }

        //Расстояние до начала координат от точки A
        double distanceToOriginPointA = calculateDistanceToOrigin(pointA);

        //Расстояние до начала координат от точки B
        double distanceToOriginPointB = calculateDistanceToOrigin(pointB);

        return (distanceToOriginPointA <= distanceToOriginPointB) ? pointA : pointB;

    }

    /**
     * Вычисляет расстояние от указанной точки до начала координат.
     * <p>
     * Расстояние до начала координат равно корню суммы квадратов координат
     * указанной точки.
     * </p>
     *
     * @param point координата X точки
     * @return расстояние от точки до начала координат
     */
    private double calculateDistanceToOrigin(Point point){
        return Math.sqrt(
                Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2)
        );
    }

}