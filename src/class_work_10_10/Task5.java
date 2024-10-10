package class_work_10_10;

public class Task5 {
    public static void main(String[] args) {
        //Задание: 5
        getTriangle(8);
    }
    //Задание 5:
    //Вывести на экран “равнобедренный треугольник”, все “рёбра” которого состоят из единиц,
    // “медиана” равна целому числу n, а вся “площадь” заполнена нулями =)
    private static void getTriangle(int n) {
        System.out.println("1");
        for (int i = 2; i <= n; i++) {
            System.out.print("1");
            for(int y=3; y<=i; y++) {
                System.out.print("0");
            }
            System.out.print("1");
            System.out.println(" ");
        }
        for (int i = n+1; i <n*2-1; i++) {
            System.out.print("1");
            for(int y=i; y<n*2-2; y++) {
                System.out.print("0");
            }
            System.out.print("1");
            System.out.println(" ");
        }
        System.out.println("1");
    }

}
