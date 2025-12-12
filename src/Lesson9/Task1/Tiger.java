package Lesson9.Task1;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("Тигр кушает мясо");
        }
        else {
            System.out.printf("Тигр такую еду не ест: %s\n", food);
        }
    }
}
