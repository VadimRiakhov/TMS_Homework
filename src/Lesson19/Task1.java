package Lesson19;

/*
Задача 1:
Создать var переменную с текстовым блоком и вывести в консоль
 */
public class Task1 {
    public static void main(String[] args) {
        var string = """
                 Это текстовый блок
                 ==================
                 Можно печатать несколько строк без конкатенации
                 """;
        System.out.println(string);
        System.out.printf("Тип переменной string, объявленной с помощью var: %s\n", string.getClass());

    }
}
