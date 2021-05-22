/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task3.scanner.SquareAreaScanner;
import by.epamtc.iovchuk.lesson1.task3.service.SquareAreaService;

/**
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Объект класса-сервиса для вычисления
         * площади вписанного в окружность квадрата
         * и отношения площади вписанного квадрата к площади внешнего
         */
        SquareAreaService squareAreaService =
                new SquareAreaService();

        /*
         * Объект класса SquareAreaScanner для считывания
         * из консоли площади квадрата, введенного пользователем
         */
        CustomScanner squareAreaScanner = new SquareAreaScanner();

        //Площадь внешнего квадрата
        double outsideSquareArea = squareAreaScanner.readDouble();

        //Площадь вписанного в окружность квадрата
        double insideSquareArea =
                squareAreaService.calculateInsideSquareArea(outsideSquareArea);

        /*
         * Отношение площади вписанного квадрата к
         * площади внешнего
         */
        int areaDiv =
                (int) squareAreaService.calculateDivide(insideSquareArea, outsideSquareArea);

        System.out.println("Площадь квадрата, вписанного в окружность, равна "
                + insideSquareArea);

        System.out.println("Площадь вписанного в окружность квадрата меньше " +
                "площади внешнего квадрата в " + areaDiv + " раз");

    }


}
