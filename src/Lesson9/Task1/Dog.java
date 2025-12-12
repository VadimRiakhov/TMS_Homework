package Lesson9.Task1;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("Собака кушает мясо");
        }
        else if(food.equals("Bones")){
            System.out.println("Собака кушает кости");
        }
        else {
            System.out.printf("Собака такую еду не ест: %s\n", food);
        }

    }
}
