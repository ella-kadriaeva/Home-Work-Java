package class_work_10_10;

public class Task5 {
    public static void main(String[] args) {
        //Задание: 5
//        getTriangle(5);
        getTriangle3(7);
    }

    //Задание 5:
    //Вывести на экран “равнобедренный треугольник”, все “рёбра” которого состоят из единиц,
    // “медиана” равна целому числу n, а вся “площадь” заполнена нулями =)
    private static void getTriangle(int n) {
        int doubleMedian = n * 2;
        System.out.println(1);
        for (int i = 2; i <= n; i++) {
            System.out.print(1);
            for (int y = 3; y <= i; y++) {
                System.out.print(0);
            }
            System.out.print(1);
            System.out.println();
        }
        for (int i = n + 1; i < doubleMedian - 1; i++) {
            System.out.print(1);
            for (int y = i; y < doubleMedian - 2; y++) {
                System.out.print(0);
            }
            System.out.print(1);
            System.out.println();
        }
        System.out.println(1);
    }

    private static void getTriangle2(int median) {
        System.out.println(1);
        int doubleMedianEnd = median * 2 - 1;
        int doubleMedianStart = median + 1;
        double count;
        for (double i = 1; i < median; i++) {
            count = Math.pow(10, i);
            count = count + 1;
            System.out.print((int) count);
            System.out.println();
        }
        for (double y = doubleMedianStart; y < doubleMedianEnd; y++) {
            double pow = doubleMedianEnd - y;
            count = Math.pow(10, pow);
            count = count + 1;
            System.out.print((int) count);
            System.out.println();
        }
        System.out.println(1);
    }

    private static void getTriangle3(int n) {
        int doubleMedian = n * 2;
        System.out.println(1);
        int count;
        for (int i = 2; i <= n; i++) {
            count = 0;
            count = count + 1;
            for (int y = 2; y <= i; y++) {
                count = count * 10;
            }
            count = count + 1;
            System.out.println(count);
        }

        for (int i = n + 1; i < doubleMedian - 1; i++) {
            count = 1;
            count = count * 10;

            for (int y = i; y < doubleMedian - 2; y++) {
                count = count * 10;
            }
            count = count + 1;
            System.out.println(count);

        }
        System.out.println(1);
    }


}
