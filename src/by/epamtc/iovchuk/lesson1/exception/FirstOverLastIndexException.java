package by.epamtc.iovchuk.lesson1.exception;

public class FirstOverLastIndexException extends Exception {

    public FirstOverLastIndexException() {
        super("Минимальный индекс диапазона не может быть больше максимального!");
    }

    public FirstOverLastIndexException(String message) {
        super(message);
    }

    public FirstOverLastIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstOverLastIndexException(Throwable cause) {
        super(cause);
    }
}
