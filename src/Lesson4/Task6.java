package Lesson4;

public class Task6 {

    /*
    Задача 6:
    Проверить, является ли массив возрастающей последовательностью (каждое следующее
    число больше предыдущего)
*/
    public static void main(String[] args){
        int size = 5; // размер массива
        int[] array = new int[size];
        boolean flag = true;

        // инициализация массива и вывод его на экран
        System.out.println("\nМассив");
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        for (int i = 1; i < size; i++) {
            if(array[i]<array[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("\nМассив является возрастающим");
        }
        else {
            System.out.println("\nМассив не является возрастающим");
        }
    }
}
