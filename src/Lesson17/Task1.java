package Lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

/*
    Задача 1:
    Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
    когда пользователю исполнится 100 лет. Использовать Date/Time API
 */
public class Task1 {
    public static void main(String[] args){
        System.out.print("Введите дату своего рождения в формате дд.мм.гггг: ");
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // удаляем лидирующие и концевые пробелы
        String date = scanner.nextLine().trim();
        if(date.isEmpty()){
            System.out.println("Ошибка! Пустая строка!");
            return;
        }
        // проверка длины строки
        if (date.length() != 10) {
            System.out.println("Ошибка! Длина строки должна быть 10 символов (дд.мм.гггг)");
            return;
        }
        // проверка точек
        if (date.charAt(2) != '.' || date.charAt(5) != '.') {
            System.out.println("Ошибка! Используйте точки в качестве разделителей (дд.мм.гггг)");
            return;
        }
        // прасинг даты
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            LocalDate datePlus100 = parsedDate.plusYears(100);
            System.out.println("Вам исполнится сто лет "+ datePlus100.format(formatter));
        }
        catch (DateTimeParseException e) {
            System.out.println("Ошибка парсинга: " + getErrorMessage(e.getMessage()));
        }
    }

    // обработка ошибки парсинга для определения причины
    private static String getErrorMessage(String error) {
        if (error.contains("Invalid value for DayOfMonth")) {
            return "Неверный день месяца (должен быть от 1 до 28-31 в зависимости от месяца)";
        } else if (error.contains("Invalid value for MonthOfYear")) {
            return "Неверный месяц (должен быть от 1 до 12)";
        } else if (error.contains("Invalid value for Year")) {
            return "Неверный год";
        } else if (error.contains("Text")) {
            return "Неверный формат. Используйте цифры и точки: дд.мм.гггг";
        }
        return "Некорректная дата";
    }


}
