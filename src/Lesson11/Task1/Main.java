package Lesson11.Task1;

import java.util.Scanner;

/*
1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину
 */
public class Main {
    public static void main(String[] args){
        String[] strings = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d и нажмите Enter: ", i+1);
            strings[i] = scanner.nextLine();
        }
        scanner.close();
        String maxString = strings[0];
        String minString = strings[0];
        for (int i = 1; i < 3; i++) {
            if(strings[i].length()<minString.length()){
                minString = strings[i];
            }
            if(strings[i].length()>maxString.length()){
                maxString = strings[i];
            }
        }
        System.out.printf("Самая длинная строка: %s, длина строки: %d\n", maxString, maxString.length());
        System.out.printf("Самая короткая строка: %s, длина строки: %d\n", minString, minString.length());
    }
}
