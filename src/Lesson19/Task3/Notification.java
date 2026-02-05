package Lesson19.Task3;

public sealed class Notification permits EmailNotification, SMSNotification, PushNotification {
    String message;
    public Notification(String message){
        this.message = message;

    }
}
