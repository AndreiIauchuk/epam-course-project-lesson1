/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.scanner;

import java.util.Scanner;

/**
 * Класс-оболочка для считывания целого числа,
 * введенного пользователем в консоль.
 *
 * @see Scanner
 * @author Иовчук Андрей
 */
public class ConsoleNumberScanner extends CustomScanner{

    /**
     * Сканнер для считывания данных, введеных пользователем в консоль.
     */
    private final Scanner consoleScanner = new Scanner(System.in);

    /**
     * Считывает введенное пользователем целое число.
     *
     * @return true, если пользователь ввел целое число
     */
    @Override
    public int read() {
        while (!consoleScanner.hasNextInt()) {
            System.err.println("Введите целое число!");
            consoleScanner.next();
        }

        return consoleScanner.nextInt();
    }

}
