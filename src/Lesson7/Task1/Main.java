package Lesson7.Task1;

/*  Задача 1:
    Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
    который печатает название должности и имплементировать этот метод в созданные
    классы
 */

public class Main {

    public static void main(String[] args) {
        Director director = new Director("Иванов Иван");
        Accountant accountant = new Accountant("Петров Петр");
        Workman workman = new Workman("Кузнецов Андрей");
        director.printPosition();
        accountant.printPosition();
        workman.printPosition();
    }
}
