/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task6.scanner.SecondScanner;
import by.epamtc.iovchuk.lesson1.task6.service.PastTimeService;

/**
 * Идет n-я секунда суток, определить, сколько полных часов,
 * полных минут и секунд прошло к этому моменту.
 * <p>
 * Класс Main.
 * </p>
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Объект класса SecondScanner для считывания
         * из консоли секунды, введенной пользователем
         */
        CustomScanner secondScanner = new SecondScanner();

        /*
         * Объект класса-сервиса для вычисления количества пройденных
         * часов, минут и секунд до момента указанной секунды
         */
        PastTimeService pastTimeService =
                new PastTimeService();

        //Введенная пользователем секунда
        int seconds = secondScanner.readInt();

        /*
         * Вычисляет количество пройденных
         * часов, минут и секунд до момента указанной секунды
         */
        pastTimeService.calculatePastTime(seconds);

        //Количество пройденных часов
        byte pastHours = pastTimeService.getPastHours();

        //Количество пройденных минут
        short pastMinutes = pastTimeService.getPastMinutes();

        //Количество пройденных секунд
        short pastSeconds= pastTimeService.getPastSeconds();


        StringBuilder pastTimeBuilder = new StringBuilder();

        pastTimeBuilder
                .append("К моменту введенной Вами секунде прошло:\n")
                .append(" - ").append(pastHours).append(" часов;\n")
                .append(" - ").append(pastMinutes).append(" минут;\n")
                .append(" - ").append(pastSeconds).append(" секунд.");

        System.out.println(pastTimeBuilder.toString());


    }


}
