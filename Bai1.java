package Tuan_2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        System.out.println("Nhap mang n phan tu]");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        bubleSort(randomArray(n, rand), n);
        System.out.println();

        selectionSort(randomArray(n, rand));
        System.out.println();

        insertionSort(randomArray(n, rand));
        System.out.println();

        MergeSort(randomArray(n, rand), 0, n-1);
        System.out.println();

        quickSort(randomArray(n, rand), 0, n-1);
        System.out.println();

        int[] test = {100, 1000, 10000, 100000};
        for (int i = 0; i < 4; i++) {
            long startTime = System.nanoTime();
            bubleSort(randomArray(test[i], rand),test[i]);
            long endTime = System.nanoTime();
            System.out.println("Thời gian chạy bulbleSort (" + test[i] + " phần tử): " + (endTime - startTime) + " ns");
        }
        for (int i = 0; i < 4; i++) {
            long startTime = System.nanoTime();
            selectionSort(randomArray(test[i], rand));
            long endTime = System.nanoTime();
            System.out.println("Thời gian chạy selectionSort (" + test[i] + " phần tử): " + (endTime - startTime) + " ns");
        }
        for (int i = 0; i < 4; i++) {
            long startTime = System.nanoTime();
            insertionSort(randomArray(test[i], rand));
            long endTime = System.nanoTime();
            System.out.println("Thời gian chạy insertionSort (" + test[i] + " phần tử): " + (endTime - startTime) + " ns");
        }
        for (int i = 0; i < 4; i++) {
            long startTime = System.nanoTime();
            MergeSort(randomArray(test[i], rand),0,test[i] - 1);
            long endTime = System.nanoTime();
            System.out.println("Thời gian chạy (" + test[i] + " phần tử): " + (endTime - startTime) + " ns");
        }
        for (int i = 0; i < 4; i++) {
            long startTime = System.nanoTime();
            quickSort(randomArray(test[i], rand), 0, test[i] - 1);
            long endTime = System.nanoTime();
            System.out.println("Thời gian chạy (" + test[i] + " phần tử): " + (endTime - startTime) + " ns");
        }
        
    }
    public static int[] arraya(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] randomArray(int n, Random rand) {
        int[] randomArr = new int[n];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rand.nextInt(10000) + 1;
        }
        return randomArr;
    }

    public static void bubleSort(int[] arr, int n) {
        int count = 0;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   swaps++; 
                }
                System.out.println(Arrays.toString(arr));
                count++;
            }
        }
        System.out.println("So lan so sanh: " + count);
        System.out.println("So lan doi cho: " + swaps);
        System.out.println(Arrays.toString(arr));
    }
    
    
    public static void selectionSort(int[] arr) {
        int count = 0;
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
                count++;
            }
            if (i != minIdx) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
                swaps++;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("So lan so sanh: " + count);
        System.out.println("So lan doi cho: " + swaps);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertionSort(int[] arr){
        int count = 0;
        int swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key ) {
                arr[j+1] = arr[j];
                j--;
                swaps++;
                count++;
            }
            arr[j+1] = key;
            swaps++;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("So lan so sanh: " + count);
        System.out.println("So lan doi cho: " + swaps);
        System.out.println(Arrays.toString(arr));
    }


    public static void MergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = left + (right-left) / 2;
            MergeSort(a, left, middle);
            MergeSort(a, middle + 1, right);
            merge(a, left, right, middle);
        }
        
    } 
    public static void merge(int[] a, int left, int right, int middle) {
        int lenleft = middle - left + 1;
        int lenright = right - middle;

        int[] L = new int[lenleft];
        int[] R = new int[lenright];

        for (int i = 0; i < lenleft; i++) {
            L[i] = a[left + i];
        }
        for (int i = 0; i < lenright; i++) {
            R[i] = a[middle + i + 1 ];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < lenleft && j < lenright) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < lenleft) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < lenright) {
            a[k] = R[j];
            j++;
            k++;
        }
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
