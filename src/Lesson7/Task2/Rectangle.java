package Lesson7.Task2;

public class Rectangle extends Figure{
    int length;
    int width;

    public Rectangle(int length, int width) {
        figureType = "Прямоугольник";
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }

    @Override
    double calculatePerimeter() {
        return (length+width)*2;
    }
}
