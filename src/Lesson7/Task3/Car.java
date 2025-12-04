package Lesson7.Task3;

public class Car implements Cloneable {
    String brand; // марка автомобиля
    String model; // модель автомобиля
    Engine engine; // двигатель

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void printCar(){
        System.out.printf("Марка: %s, модель: %s, двигатель: %s\n", brand, model, engine.getEngine());
    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            clone.engine = engine.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
