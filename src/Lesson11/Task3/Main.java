package Lesson11.Task3;

import java.util.Scanner;

/*
3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину
 */
public class Main {
    public static void main(String[] args){
        String[] strings = new String[3];
        int totalLength = 0;
        double avgLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d и нажмите Enter: ", i+1);
            strings[i] = scanner.nextLine();
            totalLength+=strings[i].length();
        }
        avgLength = (double) totalLength /strings.length;
        scanner.close();
        System.out.printf("Строки, длина которых меньше средней. Средняя длина строки %.1f\n", avgLength);
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length()<avgLength){
                System.out.println(strings[i]+" Длина строки: "+strings[i].length());
            }
        }
    }
}
