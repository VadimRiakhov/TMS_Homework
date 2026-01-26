package Lesson16.Task1;

/*
    Задача 1:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
    2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        String[] strArray1 = {"a", "b", "a", "c", "b"};
        String[] strArray2 = {"a", "b", "c"};
        String[] strArray3 = {"a", "a", "a"};
        System.out.println(checkStringArray(strArray1));
        System.out.println(checkStringArray(strArray2));
        System.out.println(checkStringArray(strArray3));
    }

    // метод для проверки массива строк
    public static Map<String, Boolean> checkStringArray(String[] stringArray){
        Map<String,Boolean> map = new HashMap<>();
        for (String s : stringArray) {
            // если ключ уже есть в мапе, то присваиваем значению true
            if(map.containsKey(s)){
                map.put(s, true);
            }
            // иначе помещаем ключ в мапу со значением false
            else{
                map.put(s, false);
            }
        }
        return map;
    }
}
