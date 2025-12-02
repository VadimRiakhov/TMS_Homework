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

public class CreditCard {

    private int accountNumber;
    private double amount;

    public CreditCard(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void withdraw(double sum){
        if(sum <=0){
            System.out.println("Ошибка! Сумма для снятия должна быть больше нуля");
            return;
        }
        if(amount<sum){
            System.out.printf("Недостаточно денег на карте для снятия суммы %.2f. Доступная сумма: %.2f\n", sum, amount);
        }
        amount-=sum;
        System.out.printf("Снятие со счета %d суммы %.2f. Остаток на карте: %.2f\n", accountNumber, sum, amount);
    }

    public void putMoney(double sum){
        if(sum <=0){
            System.out.println("Ошибка! Сумма для пополнения должна быть больше нуля");
            return;
        }
        amount+=sum;
        System.out.printf("Пополнение счета %d на %.2f. Остаток на карте: %.2f\n", accountNumber, sum, amount);
    }

    public void accountInfo(){
        System.out.printf("Номер счета: %d. Остаток денег на карте: %.2f\n", accountNumber, amount);
    }
}
