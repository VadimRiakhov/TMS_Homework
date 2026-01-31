package Lesson17;

import java.util.function.Consumer;

/*

    Задача 4:
    Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    выводить сумму, переведенную сразу в доллары
 */
public class Task4 {
    public static void main(String[] args){
        Consumer<String> convert = str->{
            double usdRate = 2.87;
            String sum = str.replace("BYN", "").trim();
            System.out.printf("Сумма %s равна %.2f USD", str, Double.parseDouble(sum)/usdRate);
        };
        convert.accept("260 BYN");
    }
}
