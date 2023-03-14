package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/users1.1.4";
    private static final String userName = "root";
    private static final String  password = "12345";

    private Util() {
        
    }

    public static Connection getConnection() {                               // Метод для получения соединения с БД
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }



}
