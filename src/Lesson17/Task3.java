package Lesson17;

import java.util.function.Function;

/*
    Задача 3:
    Используя Function реализовать лямбду, которая будет принимать в себя строку в
    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    возвращать сумму, переведенную сразу в доллары
 */
public class Task3 {
    public static void main(String[] args){
        String sumBYN = "260 BYN";
        Function<String, Double> convert = str -> {
            double usdRate = 2.87;
            String sum = str.replace("BYN","").trim();
            return Double.parseDouble(sum)/usdRate;
        };
        System.out.printf("Сумма %s равна %.2f USD", sumBYN, convert.apply(sumBYN));

    }
}
