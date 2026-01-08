package Lesson12.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Задача 1:
    Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    только из прописных букв, без чисел.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
