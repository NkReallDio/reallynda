package Tuan_2;

import java.util.Scanner;

public class Tanso {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
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
        
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                res.append(arr[i]).append(" ").append(count).append("; ");
                count = 1;
            } else {
                count++;
            }
        }
        
        System.out.println(res.toString());
        
    }
}
