/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task4.service;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;

/**
 * Класс-сервис для определения, является ли
 * число четным.
 */
public class IsNumbersEvenService {

    /**
     * Объект класса NumberScanner для считывания
     * из консоли числа, введенного пользователем.
     */
    private final CustomScanner numberScanner = new NumberScanner();

    /**
     * Общее количество введенных четных целых чисел.
     */
    private int countEvenNumbers;

    /**
     * Проверяет, являются ли введенные пользователем числа четными.
     *
     * @return true, если хотя бы два числа четные
     * @throws CustomException если пользователь неверно ввел одно из чисел
     */
    public boolean checkInsertedNumbers() throws CustomException {

        checkNextNumber("A");
        checkNextNumber("B");
        checkNextNumber("C");
        checkNextNumber("D");

        return countEvenNumbers >= 2;

    }

    /**
     * Проверяет, является ли введенное пользователем число четным.
     *
     * @param letter символ-индекс вводимого числа
     * @return true, число является четным
     * @throws CustomException если пользователь неверно ввел число
     */
    private void checkNextNumber(String letter) throws CustomException {

        System.out.print("Введите число " + letter + ": ");

        //Введенное целое число
        int insertedNumber = numberScanner.readInt();

        if (isEven(insertedNumber)) {
            countEvenNumbers++;
        }
    }

    /**
     * Проверяет, является ли указанное число четным.
     *
     * @param number число для проверки на четность
     * @return true, если число четное
     */
    private boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
