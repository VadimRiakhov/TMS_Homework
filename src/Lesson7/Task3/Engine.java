package Lesson7.Task3;

public class Engine implements Cloneable {
    String name; // название двигателя
    double power; // мощность в лошадиных силах
    double capacity; // объем

    public Engine(String name, double power, double capacity) {
        this.name = name;
        this.power = power;
        this.capacity = capacity;
    }

    public String getEngine(){
        return String.format("%s, мощность: %s л.с, объем двигателя: %s л.", name,power,capacity);
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
