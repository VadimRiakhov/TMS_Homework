package Lesson6.Task1;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.
*/

public class Main {
    public static void main(String[] args){
        // создаем объеты класса CreditCard
        CreditCard creditCard1 = new CreditCard(123, 5000);
        CreditCard creditCard2 = new CreditCard(456, 5000);
        CreditCard creditCard3 = new CreditCard(789, 5000);
        // пополнение счетов
        creditCard1.putMoney(1000);
        creditCard2.putMoney(2000);
        //снятие денес со счета
        creditCard3.withdraw(3000);
        System.out.println("Текущее состояние счетов:");
        creditCard1.accountInfo();
        creditCard2.accountInfo();
        creditCard3.accountInfo();
    }
}
