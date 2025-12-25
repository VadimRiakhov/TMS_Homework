package Lesson11.Task5;

import java.util.Scanner;

/*
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
public class Main {
    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку и нажмите Enter: ");
        str = scanner.nextLine();
        scanner.close();
        StringBuilder newStr= new StringBuilder();
        System.out.println("Строка, с задублированными буквами");
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(newStr);
    }
}
