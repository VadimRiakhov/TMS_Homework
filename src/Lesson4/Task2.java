package Lesson4;

public class Task2 {

    /*
    Задача 2:
    Найти минимальный-максимальный элементы и вывести в консоль
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
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

    }
}
