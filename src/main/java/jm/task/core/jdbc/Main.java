package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    private static final UserServiceImpl userService = new UserServiceImpl();


    public static void main(String[] args) throws SQLException {
        userService.createUsersTable();
        userService.saveUser("�������", "������", (byte) 48);
        userService.saveUser("����", "������", (byte) 78);
        userService.saveUser("��������", "�����", (byte) 34);
        userService.saveUser("���������", "������", (byte) 23);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
