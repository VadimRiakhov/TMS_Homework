package Lesson17;

/*
    Задача 2:
    Используя Predicate среди массива чисел вывести только те, которые являются
    положительными.
 */

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args){
        Predicate<Integer> isPositive = x -> x>0;
        int[] numbers = {4, 6, -2, -9, -3, 2, -55, -133, 32, 21, 90};
        System.out.print("Положительные числа: ");
        for (int number : numbers) {
            if(isPositive.test(number)){
                System.out.print(number+" ");
            }
        }

    }
}
