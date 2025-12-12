package Lesson9.Task2;

public class Dog {
    private Dog() {};

    public static void voice(){
        System.out.println("Собака лает");
    }
    public static void eat(String food) {
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
