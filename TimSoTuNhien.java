package Tuan_2;

import java.util.Scanner;

public class TimSoTuNhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp; 
                }
            }
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == min) {
                min++;
            }
        }
        System.out.println(min);
    }
    
}