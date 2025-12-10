package Lesson8.Task1;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
        specialization = "Хирург";
    }

    @Override
    public void treat() {
        System.out.println("Делаю операцию");
    }
}
