package Lesson10.Task2;

/*
Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        User user1 = new User(1, "Ivan", new Company("Google"));
        User user2 = new User(2, "Petr", new Company("Yandex"));
        User[] users;
        users = new User[]{user1, user2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int userId = scanner.nextInt();
        System.out.println("Выберите тип клонирования:\n1. Поверхностное\n2. Глубокое");
        int cloneType = scanner.nextInt();
        User user = getUserById(userId, users);
        User clonedUser;
        if(user!=null){
            switch (cloneType) {
                case 1:
                    try {
                        clonedUser = user.clone();
                    } catch (CloneNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    try {
                        clonedUser = user.deepClone();
                    } catch (CloneNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    throw new IllegalStateException("Неправильный тип клонирования: " + cloneType);
            }
            System.out.printf("""
                    Проверка клонирования:
                    Имя исходного пользователя: %s, компания: %s
                    Имя клонированного пользователя: %s, компания: %s
                    """, user.getName(),user.getCompany(),clonedUser.getName(), clonedUser.getCompany());
            System.out.printf("Проверка ссылочной целостности:\n" +
                    "Компания оригинала и клона один объект?: %s", user.getCompany()==clonedUser.getCompany());
        }
    }

    public static User getUserById(int userId, User[] users){

        for (User user : users) {
            if(user.getId() == userId) {
                return user;
            }
        }
        System.out.println("Пользователя с данным id не существует");
        return null;
    }
}


