package Lesson19;

/*
Задача 2:
Создайте record с именем Book, который хранит информацию о книге:
String title (название)
String author (автор)
int year (год издания)
double price (цена)
Напишите программу (Main class), которая:
Создает три разных объекта Book (используя new Book(...)).
Выводит информацию о книгах (метод toString() уже встроен в record).
Сравнивает две одинаковые книги (с одинаковыми полями) с помощью equals() и выводит результат (true/false).
Получает цену одной книги, используя встроенный геттер (например, book.price()).
 */

public class Task2 {
    public record Book(String title, String author, int year, double price){}

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой Л.Н.", 1873, 700);
        Book book2 = new Book("На дне", "Горький М.", 1902, 550);
        Book book3 = new Book("Война и мир", "Толстой Л.Н.", 1873, 700);
        System.out.println("Список книг");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.printf("Книга 1 и книга 3 одинаковые: %b\n", book1.equals(book3));
        System.out.printf("Книга 1 и книга 2 одинаковые: %b\n", book1.equals(book2));
        System.out.printf("Стоимость книги 1: %.2f\n", book1.price());
    }

}
