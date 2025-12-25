package Lesson10.Task2;

public class Company implements Cloneable {
    String name;

    public Company(String name) {
        this.name = name;
    }

    public Company clone() throws CloneNotSupportedException{
        return (Company) super.clone();
    }

    @Override
    public String toString() {
        return name;
    }
}
