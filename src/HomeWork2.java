import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        String myStudy = new String ("I study Basic Java!");
        System.out.print(myStudy.charAt(myStudy.length()-2));
        System.out.println(": предпоследний символ строки I study Basic Java!");
        System.out.print(myStudy.contains("Java"));
        System.out.println(" - содержит ли  строка подстроку Java");
        int numJ = myStudy.indexOf("J");
        int numEndJ = numJ + "Java".length();
        System.out.print("Вырезана строка ");
        System.out.println(myStudy.substring(numJ, numEndJ));
        System.out.println(myStudy.replace('а', 'о'));
        String strUpper = myStudy.toUpperCase();
        System.out.print(strUpper);
        String strLower = myStudy.toLowerCase();
        System.out.println(strLower);


        System.out.println("№ 2 ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число типа Int");
        double numberOne = in.nextInt();
        System.out.println("Введите еще одно число типа Int");
        double numberToo = in.nextInt();
        System.out.println("Результат:");
        System.out.printf("Сумма:" + MathOperations.summa(numberOne, numberToo));
        System.out.println(" ");
        System.out.printf("Разность:" + MathOperations.difference(numberOne, numberToo));
        System.out.println(" ");
        System.out.printf("Произведение:" + MathOperations.product(numberOne, numberToo));
        System.out.println(" ");
        System.out.printf("частное:"+ MathOperations.quotient(numberOne, numberToo));

        }
}