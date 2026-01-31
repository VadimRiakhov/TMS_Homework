package Lesson17;

import java.util.Scanner;
import java.util.function.Supplier;

/*
    Задача 5:
    Используя Supplier написать метод, который будет возвращать введенную с консоли
    строку задом наперед.
 */
public class Task5 {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Supplier<String> reverseString = () -> {
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder(scanner.nextLine());
            return sb.reverse().toString();
        };
        System.out.println("Обратная строка: "+reverseString.get());
    }
}
