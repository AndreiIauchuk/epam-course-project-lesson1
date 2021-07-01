/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6;

import by.epamtc.iovchuk.lesson1.task6.entity.PastTime;
import by.epamtc.iovchuk.lesson1.task6.scanner.SecondScanner;

/**
 * Идет n-я секунда суток, определить, сколько полных часов,
 * полных минут и секунд прошло к этому моменту.
 * <p>
 * Класс Main.
 * </p>
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {

        SecondScanner secondScanner = new SecondScanner();

        //Введенная пользователем секунда
        int seconds = secondScanner.readSecond();

        PastTime pastTime = new PastTime(seconds);

        byte pastHours = pastTime.getPastHours();
        short pastMinutes = pastTime.getPastMinutes();
        short pastSeconds = pastTime.getPastSeconds();

        StringBuilder pastTimeBuilder = new StringBuilder();

        pastTimeBuilder
                .append("К моменту введенной Вами секунды прошло:\n")
                .append(" - ").append(pastHours).append(" часов;\n")
                .append(" - ").append(pastMinutes).append(" минут;\n")
                .append(" - ").append(pastSeconds).append(" секунд.");

        System.out.println(pastTimeBuilder.toString());


    }


}
