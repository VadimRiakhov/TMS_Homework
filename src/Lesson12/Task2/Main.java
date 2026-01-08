package Lesson12.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Задача *:
    Программа на вход получает произвольный текст. В этом тексте может быть номер
    документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    может содержать не всю информацию, т.е. например, может не содержать номер
    телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    формате:
    email: teachmeskills@gmail.com
    document number: 1423-1512-51
и т.д
 */
public class Main {
    public static void main(String[] args){
        String str = """
                Клиент Иван. Документ: 1423-1512-51. Контакты: email - ivanov@mail.com, тел: +(25)1234567.
                Заявка №123. Документ: 9999-8888-77.
                Документы: 1111-2222-33 и 4444-5555-66. Звоните: +(37)9123456 или +(01)7654321.
                Предоставлены документы: 7777-8888-99, 2222-3333-44, 6666-7777-88.
                """;
        Pattern pattern = Pattern.compile("(?<document>\\b([0-9]{4}-){2}[0-9]{2}\\b)|" +
                                                "(?<email>\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b)|" +
                                                "(?<phone>\\+\\([0-9]{2}\\)[0-9]{7}\\b)");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            if(matcher.group("document")!=null){
                System.out.printf("document number: %s\n", matcher.group("document"));
            }
            else if (matcher.group("email")!=null) {
                System.out.printf("email: %s\n", matcher.group("email"));
            }
            else {
                System.out.printf("phone: %s\n", matcher.group("phone"));
            }
        }
    }

}
