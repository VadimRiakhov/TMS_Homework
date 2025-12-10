package Lesson8.Task1;

public abstract class Doctor {

    protected String name;
    protected String specialization;

    public Doctor(String name) {
        this.name = name;
    }

    public abstract void treat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
