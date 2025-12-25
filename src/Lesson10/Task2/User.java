package Lesson10.Task2;

/*
Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.
 */

public class User implements Cloneable{
    int id;
    String name;
    Company company;

    public User(int id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public User clone() throws CloneNotSupportedException{
        System.out.println("Выполнено поверхностное клонирование объекта user");
        return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException{
        User user = (User) super.clone();
        user.company = company.clone();
        System.out.println("Выполнено глубокое клонирование объекта user");
        return user;
     }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

}
