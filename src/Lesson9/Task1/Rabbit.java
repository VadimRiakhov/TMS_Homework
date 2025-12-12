package Lesson9.Task1;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Кролик кричит");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Grass")){
            System.out.println("Кролик кушает траву");
        }
        else if(food.equals("Carrot")){
            System.out.println("Кролик кушает морковку");
        }
        else {
            System.out.printf("Кролик такую еду не ест: %s\n", food);
        }
    }
}
