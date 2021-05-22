/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.validator;

/**
 * Абстрактный класс для проверки соответствия
 * введеного числа установленным правилам.
 */
public abstract class CustomValidator {

    /**
     * Метод для проверки введенного пользователем целого числа
     *
     * @param number число для проверки
     * @return true, если указанное число соответствует
     * установленным правилам
     */
    public boolean validate(int number){
        return false;
    }

    /**
     * Метод для проверки введенного пользователем вещественного числа
     *
     * @param number число для проверки
     * @return true, если указанное число соответствует
     * установленным правилам
     */
    public boolean validate(double number){
        return false;
    }
}
