package selectionsort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("enter array's element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        Selector(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Selector(int[] arr) {
        int mn;
        for (int i = 0; i < arr.length - 1; i++) {
            mn = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[mn]) {
                    mn = j;
                }
            }
            Swap(mn, i, arr);
        }

    }

    public static void Swap(int n, int m, int[] arr) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
