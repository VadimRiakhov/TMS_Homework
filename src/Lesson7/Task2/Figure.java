package Lesson7.Task2;

abstract class Figure {
    String figureType;
    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void printFigure(){
        System.out.println("Тип фигуры: " + figureType);
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }

}
