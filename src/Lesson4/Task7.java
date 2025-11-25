package Lesson4;

public class Task7 {

    /*
    Задача *:
    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    содержит нуля в начале, кроме самого числа 0
*/
    public static void main(String[] args){
        int size = 5; // размер массива
        int[] array = new int[]{9,8,9,9,9};
        int count9 = 0; // счетчик девяток в разряде числа

        // вывод массива на экран
        System.out.println("\nМассив");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        for (int i = size-1; i >=0; i--) {
            if(array[i]<9){
                array[i]++;
                break; // если хоть один разряд меньше 9, то выходим
            }
            else{
                array[i] = 0;
                count9++;
            }
        }
        System.out.println("\nНовый массив + 1");
        // если все цифры в разрядах 9, то создаем новый массив на одну цифру больше и выводим его
        if(count9 == size){
            int[] newArray = new int[size+1];
            newArray[0] = 1;
            // копируем из array в newArray
            System.arraycopy(array,0, newArray, 1, size);
            for (int i : newArray) {
                System.out.print(i+" ");
            }
        }
        // если не все цифры в разрядах 9
        else{
            for (int i : array) {
                System.out.print(i+" ");
            }
        }
    }
}
