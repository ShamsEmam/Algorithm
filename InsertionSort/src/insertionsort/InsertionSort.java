package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int arrSize;
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size");
        arrSize = s.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("enter array element");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < arrSize; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    Swap(arr, j, j + 1);
                }
                for (int k : arr) {
                    System.out.print(k + " ");
                }

                System.out.println("");
            }
        }
    }

    public static void Swap(int[] arr, int n, int m) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
