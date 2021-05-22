/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7.service;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task7.entity.Point;

/**
 * Класс-сервис для определения ближайшей к
 * началу координат точки
 */
public class ClosestPointService {

    /**
     * Объект класса NumberScanner для считывания
     * из консоли числа, введенного пользователем
     */
    CustomScanner coordinateScanner = new NumberScanner();

    /**
     * Считывает координаты X и Y для указанной точки.
     *
     * @param point точка, для который считываются
     *              координаты
     * @return точку со считанными координатами
     * @throws CustomException если пользователь неверно одну из координат
     */
    public Point definePoint(Point point) throws CustomException {
        //Введенная пользователем координата
        double insertedCoordinate = readCoordinate("X");
        point.setX(insertedCoordinate);
        insertedCoordinate = readCoordinate("Y");
        point.setY(insertedCoordinate);

        return point;
    }

    /**
     * Считывает координату по оси координат.
     *
     * @param coordinate ось координат
     * @return введеннуя пользователем координату
     * @throws CustomException если пользователь неверно координату
     */
    private double readCoordinate(String coordinate) throws CustomException {
        System.out.print("Введите координату " + coordinate + ": ");

        return coordinateScanner.readDouble();
    }


    /**
     * Определяет из двух указанных точек ближайшую к началу координат.
     *
     * @param pointA точка А для сравнения
     * @param pointB точка B для сравнения
     * @return ближайшую к началу координат точку, либо
     * null, если точки равноудаленны от начала координат
     */
    public Point defineClosestPoint(Point pointA, Point pointB) {
        //Расстояние до начала координат от точки A
        double distanceToOriginPointA = calculateDistanceToOrigin(pointA);

        //Расстояние до начала координат от точки B
        double distanceToOriginPointB = calculateDistanceToOrigin(pointB);

        if (distanceToOriginPointA < distanceToOriginPointB) {
            return pointA;
        } else if (distanceToOriginPointA > distanceToOriginPointB) {
            return pointB;
        } else {
            return null;
        }

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
    private static double calculateDistanceToOrigin(Point point) {
        return Math.sqrt(
                Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
    }

}