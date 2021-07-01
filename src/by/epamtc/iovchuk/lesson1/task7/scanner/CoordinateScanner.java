package by.epamtc.iovchuk.lesson1.task7.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;

public class CoordinateScanner {

   public double readCoordinate(String coordinate) {
      NumberScanner coordinateScanner = new NumberScanner();

      System.out.print("Введите координату " + coordinate + ": ");

      return coordinateScanner.readDouble();
   }
}
