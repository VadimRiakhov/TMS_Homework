package Lesson5;

public class Task2 {

    /*
    Задача 2:
    Создать программу для раскраски шахматной доски с помощью цикла. Создать
    двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    B(Black) или W(White). При выводе результат работы программы должен быть следующим:
    W B W B W B W B
    B W B W B W B W
    W B W B W B W B
    B W B W B W B W
    W B W B W B W B
    B W B W B W B W
    W B W B W B W B
    B W B W B W B W

*/
    public static void main(String[] args){
        int size = 8; // размер матрицы
        String[][] matrix = new String[size][size];

        // инициализация матрицы и вывод в консоль
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if((i+j)%2==0){
                    matrix[i][j] = "W";
                }
                else {
                    matrix[i][j] = "B";
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
