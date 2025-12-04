package Lesson7.Task2;

public class Circle extends Figure{

    double radius;

    public Circle(double radius) {
        figureType = "Круг";
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return radius*radius*Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
