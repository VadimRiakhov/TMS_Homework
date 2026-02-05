package Lesson19.Task3;

/*
Задача 3:
Создайте систему, которая принимает различные типы уведомлений (Email, SMS, Push) и
обрабатывает их, используя преимущества запечатанных классов.
Создайте запечатанный класс Notification, разрешив наследников EmailNotification,
SMSNotification и PushNotification.
Сделайте наследников final (или non-sealed, если допустимо расширение).
Реализуйте метод processNotification, который принимает Notification и, используя
сопоставление с образцом (pattern matching), выводит специфичное сообщение для каждого типа.
 */

public class Task3 {

    public static void processNotification(Notification n){
        if(n instanceof EmailNotification en){
            System.out.println("Email отправлен: "+en.message);
        } else if (n instanceof SMSNotification sn) {
            System.out.println("SMS отправлен: "+sn.message);
        } else if (n instanceof PushNotification pn) {
            System.out.println("Push отправлен: "+pn.message);
        }
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("Добрый день!");
        Notification smsNotification = new SMSNotification("проверочный код 9123");

        processNotification(emailNotification);
        processNotification(smsNotification);
    }
}
