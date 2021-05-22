/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;

/**
 * Абстрактный класс для считывания данных,
 * введенных пользователем в консоль.
 */
public abstract class CustomScanner {

    /**
     * Метод для считывания целого{@code int} числа,
     * введенного пользователем в консоль.
     *
     * @return введенное пользователем целое число
     * @throws CustomException если пользователь неверно ввел число
     */
    public int readInt() throws CustomException {
        return -1;
    }

    /**
     * Метод для считывания целого числа,
     * введенного пользователем в консоль.
     *
     * @return введенное пользователем целое число
     * @throws CustomException если пользователь неверно ввел число
     */
    public long readLong() throws CustomException {
        return -1;
    }

    /**
     * Метод для считывания вещественного числа,
     * введенного пользователем в консоль.
     *
     * @return введенное пользователем целое число
     * @throws CustomException если пользователь неверно ввел число
     */
    public double readDouble() throws CustomException {
        return -1;
    }

}
