/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7;

import by.epamtc.iovchuk.lesson1.exception.NullException;
import by.epamtc.iovchuk.lesson1.task7.creator.PointCreator;
import by.epamtc.iovchuk.lesson1.task7.entity.Point;
import by.epamtc.iovchuk.lesson1.task7.service.ClosestPointService;

import java.util.Arrays;

/**
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат. x y.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {
        ClosestPointService closestPointService =
                new ClosestPointService();

        PointCreator pointCreator = new PointCreator();

        //Точка А
        Point pointA = pointCreator.createPoint();

        //Точка B
        Point pointB = pointCreator.createPoint();

        //Ближайшая к началу координат точка
        Point closestPoint;
        try {
            closestPoint = closestPointService
                    .defineClosestPoint(pointA, pointB);
        } catch (NullException e) {
            e.printStackTrace();
            return;
        }

        if (closestPoint.equals(pointA)) {
            System.out.println("Точка A находится ближе к началу координат.");
        } else if (closestPoint.equals(pointB)) {
            System.out.println("Точка B находится ближе к началу координат.");
        }

    }

}
