package Lesson8.Task1;

public class Therapist extends Doctor{

    Doctor[] doctors;
    public Therapist(String name) {
        super(name);
        specialization = "Терапевт";
    }

    @Override
    public void treat() {
        System.out.println("Делаю общий осмотр");
    }

    public void assignDoctor(Patient patient){
        Doctor assignedDoctor = null;
        switch (patient.getTreatmentPlan()){
            case 1:
                for (Doctor doctor : doctors) {
                    if(doctor.getSpecialization().equals("Хирург")){
                        assignedDoctor = doctor;

                    }
                }
                break;
            case 2:
                for (Doctor doctor : doctors) {
                    if(doctor.getSpecialization().equals("Дантист")){
                        assignedDoctor = doctor;
                    }
                }
                break;
            default:
                assignedDoctor = this;
        }
        if(assignedDoctor!=null){
            patient.setDoctor(assignedDoctor);
            System.out.printf("Назначен доктор - %s %s\n", assignedDoctor.getSpecialization(), assignedDoctor.getName());
            assignedDoctor.treat();
        }
        else{
            System.out.println("Доктор не назначен");
        }
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }
}
