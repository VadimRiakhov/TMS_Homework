package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Задача 3:
Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе
 */
public class Main {

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        // заполняем студентов
        Student student1 = new Student("Ivanov Ivan", "A101", 1, new HashMap<>());
        student1.setGrade("Math", 2);
        student1.setGrade("Literature", 3);
        student1.setGrade("Biology", 3);
        student1.setGrade("Chemistry", 3);
        student1.setGrade("Physics", 3);
        students.add(student1);
        Student student2 = new Student("Petrov Petr", "A102", 2, new HashMap<>());
        student2.setGrade("Math", 3);
        student2.setGrade("Literature", 5);
        student2.setGrade("Biology", 4);
        student2.setGrade("Chemistry", 4);
        student2.setGrade("Physics", 3);
        students.add(student2);
        Student student3 = new Student("Kuznetsov Andrey", "A101", 1, new HashMap<>());
        student3.setGrade("Math", 3);
        student3.setGrade("Literature", 2);
        student3.setGrade("Biology", 2);
        student3.setGrade("Chemistry", 2);
        student3.setGrade("Physics", 2);
        students.add(student3);
        Student student4 = new Student("Titov Egor", "A102", 2, new HashMap<>());
        student4.setGrade("Math", 3);
        student4.setGrade("Literature", 5);
        student4.setGrade("Biology", 4);
        student4.setGrade("Chemistry", 4);
        student4.setGrade("Physics", 4);
        students.add(student4);
        Student student5 = new Student("Blinov Artur", "A301", 3, new HashMap<>());
        student5.setGrade("Math", 5);
        student5.setGrade("Literature", 5);
        student5.setGrade("Biology", 5);
        student5.setGrade("Chemistry", 5);
        student5.setGrade("Physics", 5);
        students.add(student5);
        // вывод всех студентов
        showAllStudents(students);
        // вывод студентов 4 курса
        printStudents(students, 4);
        // вывод студентов 2 курса
        printStudents(students, 2);
        // удаление и перевод студентов
        manageStudents(students);
        // вывод всех студентов
        showAllStudents(students);

    }

    // удаление студентов со средним баллом меньше 3 и перевод остальных студентов
    public static void manageStudents(List<Student> students){
        if(students!=null){
            System.out.println("\nУдалены следующие студенты со средним баллом меньше 3");
            // счетчик удаленных студентов
            int countRemovedStudents=0;
            for (int i=0; i<students.size(); i++) {
                // счетчик количества оценок
                int countGrades=0;
                // сумма оценок
                int sumGrades=0;
                for (int grade : students.get(i).getGrades().values()) {
                    countGrades++;
                    sumGrades+=grade;
                }
                // если средний балл меньше 3, то удаляем
                if((double)sumGrades/countGrades<3){
                    System.out.println(students.get(i).getName());
                    students.remove(i);
                    i--;
                    countRemovedStudents++;
                }
                // иначе переводим на следующий курс
                else{
                    students.get(i).setCourse(students.get(i).getCourse()+1);
                }
            }
            if(countRemovedStudents==0){
                System.out.println("Нет студентов со средним баллом меньше 3");
            }
        }
        else{
            System.out.println("В списке нет студентов!");
        }
    }

    // вывод всех студентов на курсе
    public static void printStudents(List<Student> students, int course){

        if(students!=null){
            System.out.printf("\nСписок студентов %d курса\n", course);
            int count=0;
            for (Student student : students) {
                if(student.getCourse()==course){
                    System.out.println(student.getName());
                    count++;
                }
            }
            if(count==0){
                System.out.printf("На %d курсе нет студентов\n", course);
            }
        }
        else{
            System.out.println("В списке нет студентов!");
        }
    }
    // вывод всех студентов
    public static void showAllStudents(List<Student> students){

        if(students!=null){
            if(!students.isEmpty()){
                System.out.println("\nСписок студентов");
                System.out.println("====================");
                System.out.printf("%-25s %-6s %-6s\n","Студент", "Курс", "Группа");
                for (Student student : students) {
                    System.out.printf("%-25s %-6s %-6s\n",student.getName(),student.getCourse(), student.getGroup());
                }
            }
            else{
                System.out.println("В списке нет студентов!");
            }
        }

    }



}
