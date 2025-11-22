package Lesson4;

public class Task4 {

    /*
    Задача 4:
    Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    сообщение, что их нет.
*/
    public static void main(String[] args){
        int size = 10; // размер массива
        int[] array = new int[size];

        // инициализация массива и вывод его на экран
        System.out.println("\nМассив");
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random()*10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int count = 0;
        for (int i : array) {
            if(i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Количество нулевых элементов: " + count);
        }
        else{
            System.out.println("Нулевых элементов нет");
        }




    }
}
