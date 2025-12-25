package Lesson10.Task1;

/*
Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */

import java.util.Objects;

public class User{
    int id;
    String name;
    String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        User user = (User)obj;
        return id==user.getId() && name.equals(user.getName()) && city.equals(user.getCity());

    }

    @Override
    public String toString() {
        return String.format("User id: %d, name: %s, city: %s", id, name, city);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
