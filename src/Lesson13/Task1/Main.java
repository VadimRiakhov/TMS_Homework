package Lesson13.Task1;

/*
Задача 1:
Создать класс, в котором будет статический метод. Этот метод принимает на вход три
параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
password должна быть меньше 20 символов, не должен содержать пробелов и должен
содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException. WrongPasswordException и WrongLoginException -
пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны, false в противном случае.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Тест 1: Корректные данные");
        boolean result1 = checkCredentials("user123", "password123", "password123");
        System.out.println("Результат: " + result1 + "\n");

        System.out.println("Тест 2: Логин содержит пробел");
        boolean result2 = checkCredentials("user 123", "password123", "password123");
        System.out.println("Результат: " + result2 + "\n");

        System.out.println("Тест 3: Логин слишком длинный");
        boolean result3 = checkCredentials("login1234567891234567890", "password123", "password123");
        System.out.println("Результат: " + result3 + "\n");

        System.out.println("Тест 4: Пароль без цифр");
        boolean result4 = checkCredentials("user123", "password", "password");
        System.out.println("Результат: " + result4 + "\n");

        System.out.println("Тест 5: Пароль содержит пробел");
        boolean result5 = checkCredentials("user123", "password 123", "password 123");
        System.out.println("Результат: " + result5 + "\n");

        System.out.println("Тест 6: Пароль слишком длинный");
        boolean result6 = checkCredentials("user123", "password1234567891234567890", "password1234567891234567890");
        System.out.println("Результат: " + result6 + "\n");

        System.out.println("Тест 7: Пароли не совпадают");
        boolean result7 = checkCredentials("user123", "password123", "password456");
        System.out.println("Результат: " + result7 + "\n");

    }

    static class WrongLoginException extends Exception{
        WrongLoginException(){
            super();
        }
        WrongLoginException(String message){
            super(message);
        }
    }

    static class WrongPasswordException extends Exception{
        WrongPasswordException(){
            super();
        }
        WrongPasswordException(String message){
            super(message);
        }
    }

     static boolean checkCredentials(String login, String password, String confirmPassword){
        try{
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println("Ошибка: " + e.getMessage());
            return false;
        }


    }
    // проверка логина
    private static void checkLogin(String login) throws WrongLoginException {
        // проверка пустого логина
        if(login == null) {
            throw new WrongLoginException("Логин пустой");
        }
        // проверка длины логина
        if(login.length()>=20) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов");
        }
        // проверка пробелов
        if(login.contains(" ")){
            throw new WrongLoginException("Логин не должен содержать пробелы");
        }
    }

    // проверка пароля
    private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        // проверка пустого пароля
        if(password == null) {
            throw new WrongPasswordException("Пароль пустой");
        }
        // проверка длины пароля
        if(password.length()>=20) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов");
        }
        // проверка пробелов
        if(password.contains(" ")){
            throw new WrongPasswordException("Пароль не должен содержать пробелы");
        }
        // проверка цифры
        if(!password.matches(".*\\d.*")){
            throw new WrongPasswordException("Пароль должен содержать минимум одну цифру");
        }
        // проверка подтверждения пароля
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

}