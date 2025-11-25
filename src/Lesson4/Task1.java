package Lesson4;

public class Task1 {

//    Задача 1:
//    Пройти по массиву, вывести все элементы в прямом и в обратном порядке

    public static void main(String[] args){
        int size = 10; // размер массива
        int[] array = new int[size];
        // инициализация массива
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println("Элементы массива в прямом порядке");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nЭлементы массива в обратном порядке");
        for (int i = size-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
