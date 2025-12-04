package Lesson7.Task1;

public class Accountant implements Printable {

    String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void printPosition() {
        System.out.println("Бухгалтер");
    }
}
