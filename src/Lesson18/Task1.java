package Lesson18;

/*
Задача 1:
Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 5, 7, 8, 4, 3, 5, 4, 9, 2, 1, 1, 2, 6));
        int sum = numbers.stream()
                .distinct() // удалили дубликаты
                .filter(x->x%2==0) // оставили только четные числа
                .mapToInt(Integer::intValue)// преобразуем в IntStream
                .sum(); // суммируем
        System.out.println(sum);
    }
}
