/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task7.entity;

import java.io.Serializable;

/**
 * Класс, описывающий точку на оси координат.
 */
public class Point implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Координата X точки.
     */
    private double x;

    /**
     * Координата Y точки.
     */
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x
                && y == point.y;
    }

    @Override
    public int hashCode() {
        int hashCode = 5;
        hashCode = 31 * hashCode + (int) x;
        hashCode = 31 * hashCode + (int) y;
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();

        toStringBuilder
                .append(getClass())
                .append("{ ")
                .append("x=").append(x)
                .append(", y=").append(y)
                .append(" }");

        return toStringBuilder.toString();
    }
}
