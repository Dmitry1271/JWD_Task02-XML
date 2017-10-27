package by.tc.task02.exception;

/**
 * Created by cplus on 27.10.2017.
 */
public class FilePathException extends Exception {
    public FilePathException() {
    }

    public FilePathException(String message) {
        super(message);
    }

    public FilePathException(String message, Throwable cause) {
        super(message, cause);
    }

    public FilePathException(Throwable cause) {
        super(cause);
    }

    public FilePathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
