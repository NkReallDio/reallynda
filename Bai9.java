package Tuan_2;
import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();
        System.out.println("Nhap vi tri ban dau");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = arr[k];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp; 
                }
            }
        }
        System.out.println("Mang da sap xep");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
