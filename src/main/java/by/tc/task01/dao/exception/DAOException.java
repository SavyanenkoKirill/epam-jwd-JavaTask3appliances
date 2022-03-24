package main.java.by.tc.task01.dao.exception;

import java.io.IOException;

public class DAOException extends IOException {
    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }
}
