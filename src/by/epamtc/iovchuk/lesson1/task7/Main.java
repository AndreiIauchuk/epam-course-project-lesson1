/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.task7.entity.Point;
import by.epamtc.iovchuk.lesson1.task7.service.ClosestPointService;

/**
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат. x y.
 * <p>
 * Класс Main.
 *</p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Объект класса-сервиса для определения ближайшей к
         * началу координат точки
         */
        ClosestPointService closestPointService =
                new ClosestPointService();

        System.out.println("Точка А:");

        //Точка А
        Point pointA = closestPointService.definePoint(new Point());

        System.out.println("Точка B:");

        //Точка B
        Point pointB = closestPointService.definePoint(new Point());

        Point closestPoint =
                closestPointService.defineClosestPoint(pointA, pointB);

        if (closestPoint == null) {
            System.out.println("Точки равноудалены от начала координат.");
        } else if (closestPoint.equals(pointA)) {
            System.out.println("Точка A находится ближе к началу координат.");
        } else {
            System.out.println("Точка B находится ближе к началу координат.");
        }

    }

}
