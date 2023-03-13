package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/users1.1.4";
    private static final String userName = "root";
    private static final String  password = "12345";
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();                                        // Создание таблицы

        userService.saveUser("Petr", "Ivanov", (byte) 27);       // Добавление пользователей
        userService.saveUser("Mariya", "Petrova", (byte) 28);
        userService.saveUser("Nikolay", "Muhin", (byte) 17);
        userService.saveUser("Vasiliy","Morozov", (byte) 30);

        userService.getAllUsers();                                              // Получение всеъ  пользователей и вывод

        userService.cleanUsersTable();                                          // Очистка таблицы

        userService.dropUsersTable();                                           // Удаление таблицы


    }
}
