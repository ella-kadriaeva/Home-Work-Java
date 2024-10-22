package matrixLes2410;

public class Theory {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 1, 0, 22, 50};
        int key = 23;
//        first
//        boolean flag = false;
//        int i = 0;
//        for (; i < arr.length; i++) {
//            if (arr[i] == key) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println(key + " is on " + i + " position");
//        } else {
//            System.out.println("Not found");
//        }

//        second
        int result = searchLinear(arr, key);
        if (result != -1) {
            System.out.println(key + " is on " + result + " position");
        } else {
            System.out.println("Not found");
        }
    }

    public static int searchLinear(int[] arr, int key) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}