package Lesson18;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.Map.entry;

/*
Задача *:
Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
Среди отобранных значений отобрать только те, которые имеют нечетное количество
букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.ofEntries(
            entry(1, "Ivan"),
            entry(2, "Victor"),
            entry(3, "Andrey"),
            entry(4, "Vasiliy"),
            entry(5, "Dmitriy"),
            entry(6, "Sergey"),
            entry(7, "Daniil"),
            entry(8, "Pavel"),
            entry(9, "Petr"),
            entry(10, "Valeriy"),
            entry(11, "Mikhail"),
            entry(12, "Fedor"),
            entry(13, "Aleksandr"),
            entry(14, "Igor"),
            entry(15, "Yuriy")
        );
        System.out.println("Изначальный список:");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // выводим исходный список
        List<String> reversedNames = map.entrySet().stream()
                                        .filter(x-> Pattern.compile("^(1|2|5|8|9|13)$").matcher(x.getKey().toString()).matches()) // фильтруем по ключам
                                        .filter(x->x.getValue().length()%2==1) // фильтруем по количеству букв в имени
                                        .map(x->new StringBuilder(x.getValue()).reverse().toString()) // возвращаем список имен задом наперед
                                        .toList(); // записываем в list

        System.out.println("Перевернутые имена с нечетной длиной, имеющие id (1, 2, 5, 8, 9, 13):");
        reversedNames.forEach(System.out::println);



    }
}
