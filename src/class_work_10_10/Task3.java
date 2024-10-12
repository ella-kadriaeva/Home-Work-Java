package class_work_10_10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Задание: 3
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        getLetters(str);
    }
    //Задание 3:
    //        1. Получите от пользователя Строку.
    //        2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
    private static void getLetters(String str) {
        for (int i = 0; i <str.length(); i++) {
          if (isLetter(str.charAt(i))) {
              char letter = str.charAt(i);
              System.out.print(letter);
              System.out.print(',');
             }
        }
    }

    public static boolean isLetter(char let) {
    return  let != '?' && let != '!' && let != '.' && let != ',' && let != ' ' && let != '’';

    }


}
