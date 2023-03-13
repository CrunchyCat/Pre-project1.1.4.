package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private final String url = "jdbc:mysql://127.0.0.1:3306/users1.1.4";
    private final String userName = "root";
    private final String  password = "12345";
    private Connection connection;

    private Util() { // Конструктор с реализацией подключения к БД

        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Util createUtil() {  // Метод создающий объект Util для получения connection
        return new Util();
    }

    public Connection getConnection() { // Получение connection из объекта Util
        return connection;
    }

}
