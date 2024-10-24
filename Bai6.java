package Tuan_2;
import java.util.Scanner;
import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N");
        int n = sc.nextInt();
        System.out.println("Nhap k");
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu");
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
        System.out.println(Arrays.toString(arr));
        System.out.println("Phan tu thu k la: ");
        for (int i  = 0; i < arr.length; i++) {
            if (i == k-1) {
                System.out.println(arr[i]);
            }
        }
    }
    
}