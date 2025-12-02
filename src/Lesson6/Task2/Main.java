package Lesson6.Task2;

/*
Задача *:
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // создаем объет класса CashMachine
        CashMachine cashMachine = new CashMachine(1, 3, 0);
        // внесение денег в банкомат
        cashMachine.putMoney(3,2,0);
        //снятие денег
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        while (!cashMachine.withdraw(sum)){
            sum = scanner.nextInt();
        }
        scanner.close();
    }
}