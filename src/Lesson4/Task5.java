package Lesson4;

public class Task5 {

    /*
    Задача 5:
    Пройти по массиву и поменять местами элементы первый и последний, второй и
    предпоследний и т.д.
*/
    public static void main(String[] args){
        int size = 10; // размер массива
        int[] array = new int[size];

        // инициализация массива и вывод его на экран
        System.out.println("\nМассив");
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        int temp;
        System.out.println("\nИзмененный массив");
        for (int i = 0; i < size/2; i++) {
            temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i]=temp;
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
