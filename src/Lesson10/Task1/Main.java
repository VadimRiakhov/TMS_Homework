package Lesson10.Task1;

/*
Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Ivan", "Moscow");
        User user2 = new User(2, "Petr", "London");
        User user3 = new User(1, "Ivan", "Moscow");
        User user4 = new User(1, "Ivann", "Moscow");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.printf("\nUser1 равен User2?: %s\n", user1.equals(user2));
        System.out.printf("Хэшкод User1 равен User2?: %s\n", user1.hashCode()==user2.hashCode());
        System.out.printf("User1 равен User3?: %s\n", user1.equals(user3));
        System.out.printf("Хэшкод User1 равен User3?: %s\n", user1.hashCode()==user3.hashCode());
        System.out.printf("User1 равен User4?: %s\n", user1.equals(user4));
        System.out.printf("Хэшкод User1 равен User4?: %s\n", user1.hashCode()==user4.hashCode());


    }
}