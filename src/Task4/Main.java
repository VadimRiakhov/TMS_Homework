package Task4;

/*
    Задача *:
    Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
    работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
    основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
    классов(т.е. это generic).
    Предусмотреть операции(методы):
    1. добавления элемента
    2. удаления элемента
    3. получение элемента по индексу
    4. проверка есть ли элемент в коллекции
    5. очистка всей коллекции
    Предусмотреть конструктор без параметров - создает массив размером
    по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
    массива. Предусмотреть возможность автоматического расширения коллекции при
    добавлении элемента в том случае, когда коллекция уже заполнена
 */

public class Main {
    public static void main(String[] args){
        ArrayCollection<String> stringArray = new ArrayCollection<>();
        System.out.println("Создаем коллекцию с размером по умолчанию 5");
        stringArray.add("Russia");
        stringArray.add("England");
        stringArray.add("Germany");
        stringArray.add("Spain");
        stringArray.add("USA");
        System.out.println(stringArray);
        System.out.println("Добавляем шестой элемент, чтобы проверить расширение размера коллекции");
        // добавляем шестой элемент, чтобы проверить расширение размера коллекции
        stringArray.add("Japan");
        System.out.println(stringArray);
        // получение элемента по индексу
        System.out.println("Получение элемента по индексу 1");
        System.out.println(stringArray.get(1));
        // удаление элемента
        System.out.println("Удаляем элемент по индеку 1");
        stringArray.remove(1);
        System.out.println(stringArray);
        // проверка наличия элемента в коллекции
        System.out.printf("Список содержит элемент %s: %s\n", "Spain", stringArray.contains("Spain"));
        System.out.printf("Список содержит элемент %s: %s\n", "France", stringArray.contains("France"));
        // очистка всей коллекции
        stringArray.clear();
        System.out.println("Коллеция после очистки:");
        System.out.println(stringArray);
        // создаем коллекцию с размером 2
        System.out.println("Создаем коллекцию с размером 2");
        ArrayCollection<Integer> intArraySize2 = new ArrayCollection<>(2);
        intArraySize2.add(100);
        intArraySize2.add(200);
        System.out.println(intArraySize2);
        System.out.println("Добавляем третий элемент, чтобы проверить расширение размера коллекции");
        intArraySize2.add(300);
        System.out.println(intArraySize2);
    }

}
