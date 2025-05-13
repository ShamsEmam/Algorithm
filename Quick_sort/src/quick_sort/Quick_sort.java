package quick_sort;

import java.util.Scanner;

public class Quick_sort {

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
        System.out.println("Befor sorting");
        for (int i=0;i<arrSize;i++) {
            System.out.print(arr[i] + " ");
        }
        QuickSort(arr, 0, arrSize - 1);
        System.out.println("After sorting");
        System.out.println("");
        for (int i =0;i<arrSize;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int m, int n) {
        int tmp;
        tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static void QuickSort(int arr[], int low, int high) {

        if (low < high) {
            int povit = partiton(arr, low, high);
            QuickSort(arr, low, povit - 1);
            QuickSort(arr, povit + 1, high);
        }
    }

    public static int partiton(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}
