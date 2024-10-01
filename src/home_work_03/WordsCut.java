package home_work_03;

import java.util.Scanner;

public class WordsCut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово, состоящее из четного количества букв");
        String word1 = in.next();
        System.out.println("Введите слово, состоящее из четного количества букв");
        String word2 = in.next();
        if( word1.length()%2 ==0 && word2.length()%2 ==0) {
            String one = word1.substring(0, word1.length()/2);
            String too = word2.substring(word2.length()/2);
            System.out.println("Новое составное слово: " + one.concat(too));
        }
        else {System.out.println("Будьте внимательнее! Вводите слова, состоящие из четного количества букв");}

    }

}
