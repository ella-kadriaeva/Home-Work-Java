package home_work_04;

public class MinNumber {

    public static void main(String[] args) {
    double m = 9.5;
    double n = 10.45;

    if(checkNum(m)<checkNum(n)) {
        System.out.printf("Число %f ближе к 10",m);
    }else {
        System.out.printf("Число %f ближе к 10",n);
    }

}

    public static double checkNum(double num) {
        if(num > 10 || num < 0) {
            return Math.abs(num - 10);
        }
        return (10-num);
    }
}
