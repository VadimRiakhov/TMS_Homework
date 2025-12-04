package Lesson7.Task1;

public class Director implements Printable {
    String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void printPosition() {
        System.out.println("Директор");
    }
}
