package Lesson5;

import java.util.Scanner;

public class Task3 {

    /*
    Задача *:
    Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    Формат входных данных:
    Программа получает на вход два числа n и m.
    Формат выходных данных:
    Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    символа
*/
    public static void main(String[] args){
        int n; // размер массива
        int m; // размер подмассивов

        // запрашиваем у пользователя размер матрицы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        // проверяем введенные символы
        while(!scanner.hasNextInt()){
            String invalidInput = scanner.next();
            System.out.print("Введенные символы не являются целым числом. Введите целое число: ");
        }
        n = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        // проверяем введенные символы
        while(!scanner.hasNextInt()){
            String invalidInput = scanner.next();
            System.out.print("Введенные символы не являются целым числом. Введите целое число: ");
        }
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        // вывод матрицы змейкой
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2 == 0){
                    matrix[i][j] = m*i+j;
                }
                else{
                    matrix[i][j] = m*i+m-1-j;
                }
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
