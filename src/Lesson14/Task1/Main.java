package Lesson14.Task1;

/*
    Задача 1:
    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
    Проанализировать и записать в другой файл самое длинное слово
 */

import java.io.*;

public class Main {
    public static void main(String[] args){
        String fileName = "Romeo_and_Juliet.txt";
        // создаем объект StringBuilder для записи текста
        StringBuilder text = new StringBuilder();
        // читаем файл
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                // добавляем каждую считанную строку из файла в объект StringBuilder
                text.append(line).append("\n");
            }
            // заменяем все символы кроме букв и дефисов на пробелы
            String cleanedText = text.toString().replaceAll("[^a-zA-Z\\s-]", " ");
            // разделяем весь текст на массив слов
            String[] words = cleanedText.split("\\s+");
            String longestWord = "";
            // находим самое длинное слово
            for (String word : words) {
                if(!word.trim().isEmpty()){
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            // записываем слово в файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("longestWord.txt"))) {
                writer.write("Самое длинное слово в файле "+fileName+": " + longestWord);
            }
        }
        catch (IOException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }

    }
}
