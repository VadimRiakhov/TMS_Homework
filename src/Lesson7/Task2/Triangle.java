package Lesson7.Task2;

public class Triangle extends Figure{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        figureType = "Треугольник";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double s;
        double p;
        p = calculatePerimeter() /2;
        s = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return s;
    }

    @Override
    double calculatePerimeter() {
        return sideA+sideB+sideC;
    }
}
