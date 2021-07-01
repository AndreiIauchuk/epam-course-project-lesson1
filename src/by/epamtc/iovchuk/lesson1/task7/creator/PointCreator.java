package by.epamtc.iovchuk.lesson1.task7.creator;

import by.epamtc.iovchuk.lesson1.task7.entity.Point;
import by.epamtc.iovchuk.lesson1.task7.scanner.CoordinateScanner;

/**
 * Класс-создатель точек.
 */
public class PointCreator {

    /**
     * Считывает координаты X и Y и возвращает точку
     * с указанными координатами .
     *
     * @return точку со считанными координатами
     */
    public Point createPoint() {
        Point point = new Point();

        CoordinateScanner coordinateScanner = new CoordinateScanner();

        //Введенная пользователем координата
        double insertedCoordinate;

        insertedCoordinate = coordinateScanner.readCoordinate("X");
        point.setX(insertedCoordinate);
        insertedCoordinate = coordinateScanner.readCoordinate("Y");
        point.setY(insertedCoordinate);

        return point;
    }
}
