/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task9.scanner.RadiusScanner;
import by.epamtc.iovchuk.lesson1.task9.service.CircleService;

/**
 * Вычислить длину окружности и площадь круга одного
 * и того же заданного радиуса R.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Объект класса RadiusScanner для считывания
         * из консоли радиуса, введенного пользователем
         */
        CustomScanner radiusScanner = new RadiusScanner();

        /*
         * Объекта класса-сервиса для вычисления
         * длины окружности и площади круга
         */
        CircleService circleService = new CircleService();

        //Введенный пользователем радиус
        double insertedRadius = radiusScanner.readDouble();

        //Длина окружности
        double circleCircumference =
                circleService.calculateCircumference(insertedRadius);

        //Площадь круга
        double circleArea =
                circleService.calculateCircleArea(insertedRadius);

        System.out.println("Длина окружности заданного радиуса равна "
                + circleCircumference + ".");

        System.out.println("Площадь круга заданного радиуса равна "
                + circleArea + ".");
    }

}
