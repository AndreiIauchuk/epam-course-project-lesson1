/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7;

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

    /**
     * Значение {@code double} введенного пользователем целого числа,
     * характеризующего координату.
     */
    private static double insertedCoordinate;

    /**
     * Координата x точки А {@code double}.
     */
    private static double coordinateAx;

    /**
     * Координата y точки А {@code double}.
     */
    private static double coordinateAy;

    /**
     * Координата x точки B {@code double}.
     */
    private static double coordinateBx;

    /**
     * Координата y точки B {@code double}.
     */
    private static double coordinateBy;


    public static void main(String[] args) {
        readAllInsertedCoordinates();
        defineClosestPoint();
    }


    /**
     * Считывает все введенные координаты.
     */
    private static void readAllInsertedCoordinates() {
        readInsertedCoordinate("A", "x");
        coordinateAx = insertedCoordinate;
        readInsertedCoordinate("A", "y");
        coordinateAy = insertedCoordinate;
        readInsertedCoordinate("B", "x");
        coordinateBx = insertedCoordinate;
        readInsertedCoordinate("B", "y");
        coordinateBy = insertedCoordinate;
        consoleScanner.close();
    }

    /**
     * Считывает введенное пользователем число {@code double}.
     *
     * @param letter     буква-индекс точки
     * @param coordinate координата точки
     */
    private static void readInsertedCoordinate(String letter, String coordinate) {
        System.out.println(
                "Введите координату " + coordinate
                        + " точки " + letter + ":");

        validateInsertedCoordinate(letter, coordinate);
    }

    /**
     * Проверяет введенное пользователем координаты точки {@code double}.
     *
     * @param letter     буква-индекс проверяемой точки
     * @param coordinate координата проверяемой точки
     */
    private static void validateInsertedCoordinate(String letter, String coordinate) {
        if (consoleScanner.hasNextDouble()) {
            insertedCoordinate = consoleScanner.nextDouble();
        } else {
            System.err.println("Введите число!");
            consoleScanner.nextLine();
            /*
             * Если пользователь вводит неверные данные,
             * вызывается метод readInsertedCoordinate(letter, coordinate)
             * для повторной попытки ввода координат точки
             */
            readInsertedCoordinate(letter, coordinate);
        }

    }

    /**
     * Определяет ближайшую к началу координат точку.
     */
    private static void defineClosestPoint() {

        //Расстояние до начала координат от точки A
        double distanceToOriginPointA;

        //Расстояние до начала координат от точки B
        double distanceToOriginPointB;

        distanceToOriginPointA = defineDistanceToOrigin(coordinateAx, coordinateAy);
        distanceToOriginPointB = defineDistanceToOrigin(coordinateBx, coordinateBy);

        if (distanceToOriginPointA < distanceToOriginPointB) {
            System.out.println("Точка А ближе к началу координат.");
        } else if (distanceToOriginPointA > distanceToOriginPointB) {
            System.out.println("Точка B ближе к началу координат.");
        } else {
            System.out.println("Точка равноудалены до началу координат.");
        }


    }

    /**
     * Вычисляет расстояние от точки до начала координат,
     * равное корню суммы квадратов координат.
     *
     * @param coordinateX координата X точки
     * @param coordinateY координата Y точки
     * @return расстояние от точки до начала координат
     */
    private static double defineDistanceToOrigin(double coordinateX,
                                                 double coordinateY) {
        return Math.sqrt(
                Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }
}
