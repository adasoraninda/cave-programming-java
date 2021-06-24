package com.adasoraninda;

import java.sql.SQLException;

public class DaoException extends RuntimeException {
    private static final Long serialVersionUUID = 1L;

    public DaoException(SQLException e) {
        super(e);
    }

}