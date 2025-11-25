package Lesson4;

public class Task3 {

    /*
    Задача 3:
    Найти индексы минимального и максимального элементов и вывести в консоль
*/
    public static void main(String[] args){
        int size = 10; // размер массива
        int[] array = new int[size];

        // инициализация массива и вывод его на экран
        System.out.println("\nМассив");
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if(array[i]< array[minIndex]){
                minIndex = i;
            }
            if(array[i]>array[maxIndex]){
                maxIndex = i;
            }
        }

        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);

    }
}
