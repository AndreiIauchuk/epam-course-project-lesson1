package by.epamtc.iovchuk.lesson1.task10.entity;

import java.io.Serializable;

public class Segment implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final double DEFAULT_SEGMENT_START = 0;
    private static final double DEFAULT_SEGMENT_END = 10;
    private static final double DEFAULT_SEGMENT_STEP = 1;

    //Начало отрезка
    private final double start;

    //Конец отрезка
    private final double end;

    //Шаг
    private final double step;

    public Segment() {
        this.start = DEFAULT_SEGMENT_START;
        this.end = DEFAULT_SEGMENT_END;
        this.step = DEFAULT_SEGMENT_STEP;
    }

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
        this.step = DEFAULT_SEGMENT_STEP;
    }

    public Segment(double start, double end, double step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public double getStep() {
        return step;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return start == segment.start &&
                end == segment.end &&
                step == segment.step;
    }

    @Override
    public int hashCode() {
        int hashCode = 5;
        hashCode = 31 * hashCode + (int) start;
        hashCode = 31 * hashCode + (int) end;
        hashCode = 31 * hashCode + (int) step;
        return hashCode;
    }

    @Override
    public String toString() {

        StringBuilder toStringBuilder = new StringBuilder();

        toStringBuilder
                .append(getClass())
                .append("{ ")
                .append("start=").append(start)
                .append(", end=").append(end)
                .append(" }");

        return toStringBuilder.toString();
    }
}
