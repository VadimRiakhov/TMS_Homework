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

public class CashMachine {
    int banknote20;
    int banknote50;
    int banknote100;

    public CashMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    // внесение денег в банкомат
    public void putMoney(int banknote20, int banknote50, int banknote100){
        this.banknote20+=banknote20;
        this.banknote50+=banknote50;
        this.banknote100+=banknote100;
        int amount = calculateAmount(banknote20, banknote50, banknote100);
        System.out.printf("Внесение денежных средств в размере %d\n", amount);
    }

    // снятие денег
    public boolean withdraw(int sum){
        int tempSum = sum;

        // проверка запроса суммы больше нуля
        if(sum <=0){
            System.out.println("Ошибка! Сумма для снятия должна быть больше нуля\n");
            return false;
        }
        int amount = calculateAmount();
        // проверка достаточности денежных средств
        if (sum>amount){
            System.out.printf("Недостаточно денежных средств для снятия. Максимально возможная сумма: %d\n", amount);
            return false;
        }
        // проверка кратности 10
        if (sum%10>0 || sum<20){
            System.out.println("Введите сумму больше 20 и кратную 10");
            return false;
        }
        int count100 = sum/100;
        // запрошенная сумма>100
        if (count100>0)
        {
            // если количество имеющихся банкнот по 100 меньше нужного количества
            if (banknote100<count100){
                count100 = banknote100;
            }
            // вычитаем из общей суммы, сумму 100 банкнот
            tempSum = tempSum - count100*100;
        }
        if(tempSum==0){
            printWithdrawal(sum, count100, 0, 0);
            return true;
        }
        int count50 = tempSum/50;
        if (count50>0)
        {
            boolean flag = true;
            while (flag){
                int temp = tempSum;
                if (banknote50<count50){
                    count50 = banknote50;
                }
                temp = temp - count50*50;
                if(temp%20==0){
                    tempSum = temp;
                    flag = false;
                }
                else{
                    count50--;
                    if(count50==0){
                        flag = false;
                    }
                }
            }
        }
        int count20 = tempSum/20;
        if(tempSum%20==10 || banknote20<count20){
            System.out.println("Невозможно выдать данную сумму из-за отсутствия номинала купюр");
            return false;
        }
        printWithdrawal(sum, count100, count50, count20);
        return true;
    }

    // подсчет общего количества денег
    public int calculateAmount(){
        return banknote20*20+banknote50*50+banknote100*100;
    }
    // подсчет внесенных денег
    public int calculateAmount(int banknote20, int banknote50, int banknote100){
        return banknote20*20+banknote50*50+banknote100*100;
    }

    // вывод в консоль
    public void printWithdrawal(int sum, int count100, int count50, int count20){
        System.out.printf("Снятие суммы %d. Выданы купюры номиналом: 100 - %d шт., 50 - %d шт., 20 - %d шт.\n", sum, count100, count50, count20);
    }

}
