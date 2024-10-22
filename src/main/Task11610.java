package main;

import java.util.Arrays;

public class Task11610 {
    public static void main(String[] args) {
        int [] arrayNumb;

        arrayNumb = new int [99];
        for(int i=0; i<arrayNumb.length; i++) {
            arrayNumb[i]=i+1;
        }
        for (int j=arrayNumb.length-1; j>=0; j--) {
            if(arrayNumb[j]%2!=0){
                System.out.println(arrayNumb[j]);
            }
        }
        int [ ] arr = new int [50];
        int k =0;
        for(int i=1; i<100; i+=2) {
           arr[k] =i;
           k++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
