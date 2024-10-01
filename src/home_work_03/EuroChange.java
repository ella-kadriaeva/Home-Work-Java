package home_work_03;

import java.util.Scanner;

public class EuroChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в Евро для конвертации");
        String summaEuro = in.next();
        Double euroSumma = Double.valueOf(summaEuro);
        System.out.println("Полученная сумма  в долларах США составляет: " + changeEuro(euroSumma, 1.1102));
    }

    public static double changeEuro(double num, double k) {
        return num * k;
    }
}
