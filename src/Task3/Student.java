package Task3;

import java.util.HashMap;

public class Student {
    String name; // группа
    String group; // группа
    int course; // курс
    HashMap<String, Integer> grades; // предмет-оценка

    public Student(String name, String group, int course, HashMap<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }

    public void setGrade(String subject, int grade) {
        grades.put(subject, grade);
    }


}
