/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.scanner;

import java.util.Scanner;

/**
 * Класс для считывания числа, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code Scanner} для считывания данных,
 * введеных в консоль.
 * </p>
 *
 *  @see Scanner
 *
 * @author Иовчук Андрей
 */
public class NumberScanner {

    /**
     * Сканнер для считывания данных, введеных пользователем в консоль.
     */
    private final Scanner consoleScanner = new Scanner(System.in);

    /**
     * Считывает введенное пользователем целое число {@code int}.
     *
     * @return true, если пользователь ввел целое число
     */
    public int readInt() {
        while (!consoleScanner.hasNextInt()) {
            System.err.println("Введите целое число!");
            consoleScanner.next();
        }

        return consoleScanner.nextInt();
    }

    /**
     * Считывает введенное пользователем целое число {@code long}.
     *
     * @return true, если пользователь ввел целое число
     */
    public long readLong() {
        while (!consoleScanner.hasNextLong()) {
            System.err.println("Введите целое число!");
            consoleScanner.next();
        }

        return consoleScanner.nextLong();
    }

    /**
     * Считывает введенное пользователем вещественное число.
     *
     * @return true, если пользователь ввел вещественное число
     */
    public double readDouble() {
        while (!consoleScanner.hasNextDouble()) {
            System.err.println("Введите вещественное число!");
            consoleScanner.next();
        }

        return consoleScanner.nextDouble();
    }
}
