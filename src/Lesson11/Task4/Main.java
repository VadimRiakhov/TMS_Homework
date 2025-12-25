package Lesson11.Task4;

import java.util.Arrays;
import java.util.Scanner;

/*
4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
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

        System.out.println("Строка, состоящая только из различных символов");
        for (int i = 0; i < strings.length; i++) {
            Character[] chars = new Character[strings[i].length()];
            boolean flag;
            for (int j = 0; j < strings[i].length(); j++) {
                flag = Arrays.asList(chars).contains(strings[i].charAt(j));
                if(flag){
                    break;
                }
                chars[j]=strings[i].charAt(j);
                if(j==strings[i].length()-1){
                    System.out.println(strings[i]);
                    return;
                }
            }
        }
    }
}
