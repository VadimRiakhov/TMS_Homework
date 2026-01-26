package Lesson16.Task2;

/*
    Задача 2:
    На вход поступает массив непустых строк, создайте и верните Map<String,
    String> следующим образом: для каждой строки добавьте ее первый символ в
    качестве ключа с последним символом в качестве значения. Пример:
    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    pairs(["man", "moon", "main"]) → {"m": "n"}
    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        String[] strArray1 = {"code", "bug"};
        String[] strArray2 = {"man", "moon", "main"};
        String[] strArray3 = {"man", "moon", "good", "night"};
        System.out.println(checkStringArray(strArray1));
        System.out.println(checkStringArray(strArray2));
        System.out.println(checkStringArray(strArray3));
    }

    // метод для проверки массива строк
    public static Map<String, String> checkStringArray(String[] stringArray){
        Map<String,String> map = new HashMap<>();
        for (String s : stringArray) {
            map.put(s.substring(0,1), s.substring(s.length()-1));
        }
        return map;
    }
}
