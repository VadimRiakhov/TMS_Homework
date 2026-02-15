package Lesson20;

import java.util.Scanner;

/*
Задача 1:
Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
вычислений возвращаются в метод main().

 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String[] numbersStr = input.trim().split("\\s+");
        // массив чисел
        int[] array = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            try {
                array[i] = Integer.parseInt(numbersStr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при парсинге числа '" + numbersStr[i] + "'. Будет присвоен 0.");
                array[i] = 0;
            }
        }
        // объект поиска максимума
        MaxFinder maxFinder = new MaxFinder(array);
        // объект поиска минимума
        MinFinder minFinder = new MinFinder(array);
        // поток поиска максимума
        Thread maxThread = new Thread(maxFinder);
        // поток поиска минимума
        Thread minThread = new Thread(minFinder);

        //запускаем потоки
        maxThread.start();
        minThread.start();

        // ожидаем завершения всех потоков
        try{
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка при ожидании завершения потоков: " + e.getMessage());
        }
        // вывод значений
        System.out.println("Максимальное значение в массиве: " + maxFinder.getMax());
        System.out.println("Минимальное значение в массиве: " + minFinder.getMin());


    }

    static class MaxFinder implements Runnable{

        private final int[] array;
        private int max;

        public MaxFinder(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            System.out.println("Запущен поток поиска максимума");
            if(array.length>0){
                max = array[0];
                for (int i : array) {
                    if(i>max){
                        max = i;
                    }
                }
            }
            System.out.println("Поток поиска максимума завершил работу");
        }

        public int getMax() {
            return max;
        }
    }

    static class MinFinder implements Runnable{

        private final int[] array;
        private int min;

        public MinFinder(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            System.out.println("Запущен поток поиска минимума");
            if(array.length>0){
                min = array[0];
                for (int i : array) {
                    if(i< min){
                        min = i;
                    }
                }
            }
            System.out.println("Поток поиска минимума завершил работу");
        }

        public int getMin() {
            return min;
        }
    }



}
