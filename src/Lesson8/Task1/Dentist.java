package Lesson8.Task1;

public class Dentist extends Doctor{

    public Dentist(String name) {
        super(name);
        specialization = "Дантист";
    }

    @Override
    public void treat() {
        System.out.println("Лечу зубы");
    }
}
