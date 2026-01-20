package Lesson14.Task2;

import java.io.*;
import java.util.Scanner;

/*
    Задача *:
    Допустим есть txt файл с номерами документов. Номером документа является строка,
    состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
    номер документа с новой строки и в строке никакой другой информации, только номер
    документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
    последовательности docnum(далее любая последовательность букв/цифр) или
    contract(далее любая последовательность букв/цифр). Написать программу для чтения
    информации из входного файла - путь к входному файлу должен задаваться через
    консоль. Программа должна проверять номера документов на валидность. Валидные
    номера документов следует записать в один файл-отчет. Невалидные номера документов
    следует записать в другой файл-отчет, но после номеров документов следует добавить
    информацию о том, почему этот документ не валиден
 */
public class Main {
    public static void main(String[] args){
        System.out.print("Введите название файла: ");
        Scanner scanner = new Scanner(System.in);
        // StringBuilder для валидных номеров
        StringBuilder validNumbers = new StringBuilder();
        // StringBuilder для невалидных номеров
        StringBuilder invalidNumbers = new StringBuilder();
        String fileName = scanner.nextLine();
        // регулярное выражение для валидного номера
        String regex = "^(docnum[a-zA-Z0-9]{9}|contract[a-zA-Z0-9]{7})$";
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while ((line = reader.readLine()) != null){
                // если номер валидный добавляем в StringBuilder валидных номеров
                if(line.matches(regex)){
                    validNumbers.append(line).append("\n");
                }
                // если номер невалидный, то находим причину
                else{
                    // проверка соответствия началу номера
                    if(line.matches("^(?!docnum|contract).*$")){
                        invalidNumbers.append(line).append(" - номер документа не начинается с docnum или contract\n");
                    }
                    else{
                        // проверка длины
                        if (line.length()<15){
                            invalidNumbers.append(line).append(" - номер документа меньше 15 знаков\n");
                        }
                        else if(line.length()>15){
                            invalidNumbers.append(line).append(" - номер документа больше 15 знаков\n");
                        }
                        // посимволльная проверка
                        else{
                            for (char c : line.toCharArray()) {
                                // если цифра или буква, то ищем дальше
                                if (Character.isLetterOrDigit(c)) {
                                    continue;
                                }
                                // если найден пробел
                                else if(Character.isWhitespace(c)){
                                    invalidNumbers.append(line).append(" - присутствует пробел\n");
                                }
                                // в остальных случаях остаются спецсимволы
                                else {
                                    invalidNumbers.append(line).append(" - присутствует спецсимвол ").append(c).append("\n");
                                }
                            }
                        }
                    }
                }
            }
            // записывваем валидные номера в файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("validNumbers.txt"))) {
                writer.write(validNumbers.toString());
            }
            // записывваем невалидные номера в файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("invalidNumbers.txt"))) {
                writer.write(invalidNumbers.toString());
            }
        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }



}
