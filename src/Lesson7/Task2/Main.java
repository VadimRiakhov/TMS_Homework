package Lesson7.Task2;

/*
    Задача 2:
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
    периметра всех фигур в массиве
 */
public class Main {

    public static void main(String[] args) {
        Figure circle1 = new Circle(3);
        Figure circle2 = new Circle(4);
        Figure rectangle1 = new Rectangle(2,3);
        Figure rectangle2 = new Rectangle(4,5);
        Figure triangle1 = new Triangle(2,3,4);
        Figure[] array = {circle1, circle2, rectangle1, rectangle2, triangle1};
        double totalPerimeter=0;

        // выводим фигуры и считаем общий периметр
        for (Figure figure : array) {
            figure.printFigure();
            totalPerimeter+=figure.calculatePerimeter();
        }
        System.out.printf("Общая площадь всех фигур: %.2f\n", totalPerimeter);

    }
}