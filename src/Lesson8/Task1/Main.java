package Lesson8.Task1;

/*
Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить.
 */
public class Main {

    public static void main(String[] args){
        Patient patient1 = new Patient("Кузнецов Андрей", 1);
        Patient patient2 = new Patient("Петров Петр", 2);
        Patient patient3 = new Patient("Воробьев Сергей",3);
        Therapist therapist = new Therapist("Пирогов Николай Иванович");
        Surgeon surgeon = new Surgeon("Склифосовский Николай Васильевич");
        Dentist dentist = new Dentist("Павлов Иван Петрович");

        Doctor[] doctors = {therapist, surgeon, dentist};
        therapist.setDoctors(doctors);
        patient1.displayInfo();
        therapist.assignDoctor(patient1);
        patient2.displayInfo();
        therapist.assignDoctor(patient2);
        patient3.displayInfo();
        therapist.assignDoctor(patient3);
    }
}
