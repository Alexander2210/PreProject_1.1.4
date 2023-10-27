package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Алексей", "Ватин", (byte) 25);
        userService.saveUser("Дмитрий", "Иванов", (byte) 34);
        userService.saveUser("Иван", "Соколов", (byte) 27);
        userService.saveUser("Мария", "Бунина", (byte) 24);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
