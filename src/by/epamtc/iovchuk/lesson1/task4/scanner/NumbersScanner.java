package by.epamtc.iovchuk.lesson1.task4.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;

public class NumbersScanner {

    /**
     * Считывает из консоли заданное количество значений
     * и возвращает массив этих значений.
     *
     * @param count количество значения для считывания
     * @return массив введенных значений
     */
    public int[] readNumbers(int count) {
        NumberScanner numberScanner = new NumberScanner();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число: ");
            numbers[i] = numberScanner.readInt();
        }

        return numbers;
    }
}
