package Lesson7.Task1;

public class Workman implements Printable{
    String name;

    public Workman(String name) {
        this.name = name;
    }

    @Override
    public void printPosition() {
        System.out.println("Рабочий");
    }
}
