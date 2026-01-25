package Task1;

import java.util.*;

/*
    Задача 1:
    Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
    4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
    При решении использовать коллекции.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Введите числа через запятую:");
        Scanner scanner = new Scanner(System.in);
        // считываем строку
        String numbers = scanner.nextLine();
        // разбиваем строку
        String[] splittedNumbers = numbers.split("\\s*,\\s*");
        // создаем из массива LinkedHashSet, который не сожержит дубликатов
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(splittedNumbers));
        // соединяем строку обратно
        String result = String.join(", ", uniqueNumbers);
        System.out.println(result);
    }
}
