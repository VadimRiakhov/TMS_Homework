package Lesson11.Task2;

import java.util.Scanner;

/*
2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины
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
        // сортировка пузырьком
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = 0; j < strings.length-i-1; j++) {
                if(strings[i].length()>strings[i+1].length())
                {
                    String temp = strings[i];
                    strings[i]=strings[i+1];
                    strings[i+1]=temp;
                }
            }
        }
        // вывод в консоль
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
