package by.epamtc.iovchuk.lesson1.task10.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;

public class SegmentPointsScanner {

    private final NumberScanner segmentPointScanner = new NumberScanner();

    public double readSegmentStart() {
        System.out.print("Введите начало отрезка [a,b]: ");
        return readPoint();
    }

    public double readSegmentEnd() {
        System.out.print("Введите конец отрезка [a,b]: ");
        return readPoint();
    }

    private double readPoint() {
        return segmentPointScanner.readDouble();
    }
}
