package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "1234";
        String connectionURL = "jdbc:mysql://localhost:3306/mydbtest";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionURL, userName, password);
        return connection;
    }
}

