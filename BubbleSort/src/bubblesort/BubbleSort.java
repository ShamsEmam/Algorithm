package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int arrSize;
        Scanner n = new Scanner(System.in);
        System.out.println("enter array size");
        arrSize = n.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("enter element of array");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = n.nextInt();
        }
        Bubble_sort(arr);
        for(int i=0;i<arrSize;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void Swap(int arr[], int m, int n) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[m];
            arr[m] = arr[n];
            arr[n] = tmp;
        }
    }
}
