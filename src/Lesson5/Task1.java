package Lesson5;

import java.util.Scanner;

public class Task1 {

    /*
    Задача 1:
    1.1 Создать двумерный массив, заполнить его случайными числами.
    1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    1.3 Найти сумму всех получившихся элементов и вывести в консоль.
*/
    public static void main(String[] args){
        int n = 2; // размер массива
        int m = 3; // размер подмассивов

        int[][] matrix = new int[n][m];

        // инициализация матрицы и вывод в консоль
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) Math.round(Math.random()*100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // запрашиваем у пользователя число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        // проверяем введенные символы
        while(!scanner.hasNextInt()){
            String invalidInput = scanner.next();
            System.out.print("Введенные символы не являются целым числом. Введите целое число: ");
        }
        int number = scanner.nextInt();
        int sum = 0; // сумма всех чисел
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] += number;
                sum += matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех чисел матрицы: " + sum);
    }
}
