package Lesson7.Task3;

/*
    Задача *:
    Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable
 */
public class Main {

    public static void main(String[] args) {
        Engine vaz21129 = new Engine("ВАЗ-21129", 106, 1.6);
        Car vesta = new Car("Лада", "Веста", vaz21129);

        vesta.printCar();

        Car vestaSport = vesta.clone();
        System.out.println("Клонированная копия весты:");
        vestaSport.printCar();
        vestaSport.getEngine().setName("ВАЗ-21179");
        vestaSport.getEngine().setPower(145);
        vestaSport.getEngine().setCapacity(1.8);
        System.out.println("Клонированная копия весты после изменения двигателя:");
        vestaSport.printCar();
        System.out.println("Изначальная веста:");
        vesta.printCar();

    }
}

