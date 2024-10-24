package Tuan_2;


import java.util.Scanner;

public class SoChinhPhuong {
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
        int[] arr2 = new int[n];
        int count = 0;
        if (Math.sqrt(arr[0]) % 1 == 0) {
                arr2[count] = arr[0];
                count++;
            }
        for (int i = 1; i < n; i++) {
            if (Math.sqrt(arr[i]) % 1 == 0) {
                if (arr[i] == arr[i-1]) {
                    continue;
                }
                arr2[count] = arr[i];
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("NULL");
        }else{
            for (int i = 0; i < n; i++) {
                if (arr2[i] != 0) {
                    System.out.print(arr2[i] + " ");
                }
                else break;
            }
        }
    }
    
}
