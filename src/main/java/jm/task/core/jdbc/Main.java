package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Евгений", "Смелов", (byte) 24);
        userDao.saveUser("Екатерина", "Богданова", (byte) 32);
        userDao.saveUser("Иван", "Петров", (byte) 31);
        userDao.saveUser("Юлия", "Сергеева", (byte) 25);
        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}