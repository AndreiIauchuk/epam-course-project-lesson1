/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.scanner;

import by.epamtc.iovchuk.lesson1.CustomException;

/**
 * Абстрактный класс для считывания данных,
 * введенных пользователем в консоль.
 */
public abstract class CustomScanner {

    /**
     * Метод для считывания целого числа,
     * введенного пользователем в консоль.
     *
     * @return введенное пользователем целое число
     */
    public int read() throws CustomException {
        return -1;
    };
}
