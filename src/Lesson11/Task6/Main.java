package Lesson11.Task6;

import java.util.Scanner;

/*
Задача *:
Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
в строке 5 слов, а на вход программе передали число 500
 */
public class Main {
    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку со словами, разделенными пробелами, и нажмите Enter: ");
        str = scanner.nextLine();
        System.out.println("Введите порядковый номер слова и нажмите Enter: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else{
            System.out.println("Ошибка ввода порядкового номера слова");
            return;
        }
        scanner.close();
        String[] strings = str.split(" ");
        if (num>strings.length){
            System.out.println("Введенное число больше количества слов в строке");
        } else if (num<1) {
            System.out.println("Введите целое положительное число");
        } else{
            String strToCheck = strings[num-1];
            String reversedStrToCheck = new StringBuilder(strToCheck).reverse().toString();
            if(strToCheck.equals(reversedStrToCheck)){
                System.out.printf("Слово %s является палиндромом", strToCheck);
            }
            else{
                System.out.printf("Слово %s не является палиндромом", strToCheck);
            }
        }


    }
}
