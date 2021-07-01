package by.epamtc.iovchuk.lesson1.validator;

public class Validator {

    public boolean validateOverZero(int value) {
        return (value > 0);
    }

    public boolean validateOverZero(double value) {
        return (value > 0);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean validateOverOrEqualsZero(int value) {
        return (value >= 0);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean validateOverOrEqualsMin(int value, int min) {
        return (value >= min);
    }

    public boolean validateLessOrEqualsMax(int value, int max) {
        return (value <= max);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean validateNotNull(Object obj) {
        return (obj != null);
    }

    public boolean validateFirstIndexLessThenLast(double firstIndex, double lastIndex) {
        return (firstIndex < lastIndex);
    }
}
