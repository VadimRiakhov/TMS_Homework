package Lesson20;

import java.util.Arrays;

/*
Задача 2:
Сортировка массива цифр в нескольких потоках различными алгоритмами:
 сортировка вставками;
 сортировка выбором;
 сортировка пузырьком.
Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
результат отсортированных массивов в консоль
 */
public class Task2 {

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void insertionSort(int[] array){
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < array.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            //меняем местами наименьший с sortArr[i]
            array[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {45, 98, 1, 6, 56, 41, 5, 10, 198, 44, 33, 4, 3, 54, 78, 87, 43};
        int[] insertionArray = Arrays.copyOf(numbers, numbers.length);
        int[] selectionArray = Arrays.copyOf(numbers, numbers.length);
        int[] bubbleArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("\nИсходный массив: "+Arrays.toString(numbers));
        Thread insertionThread = new Thread(()->{
            insertionSort(insertionArray);
        });
        Thread selectionThread = new Thread(()->{
            selectionSort(selectionArray);
        });
        Thread bubbleThread = new Thread(()->{
            bubbleSort(bubbleArray);
        });

        // апускаем потоки
        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        // ожидаем завершение всех потоков
        try{
            insertionThread.join();
            selectionThread.join();
            bubbleThread.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("""
                Результат сортировки
                ====================""");
        System.out.println("Сортировка вставками: "+ Arrays.toString(insertionArray));
        System.out.println("Сортировка выбором: "+ Arrays.toString(selectionArray));
        System.out.println("Сортировка пузырьком: "+ Arrays.toString(bubbleArray));
    }





}


