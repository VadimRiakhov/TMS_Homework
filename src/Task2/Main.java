package Task2;

import java.util.Arrays;
import java.util.LinkedList;

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
 */
public class Main {
    public static void main(String[] args){
        String[] animalsArray = {"Лев", "Собака", "Тигр", "Крокодил"};
        LinkedList<String> animals = new LinkedList<>(Arrays.asList(animalsArray));
        AnimalCollection animalCollection = new AnimalCollection(animals);
        // выводим первоначальную коллекцию
        System.out.println(animalCollection);
        // добавляем кошку
        animalCollection.addAnimal("Кошка");
        System.out.println(animalCollection);
        // удаляем животное
        animalCollection.removeAnimal();
        System.out.println(animalCollection);
        // удаляем животное
        animalCollection.removeAnimal();
        System.out.println(animalCollection);
        // добавляем кита
        animalCollection.addAnimal("Кит");
        System.out.println(animalCollection);
    }
}
