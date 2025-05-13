package selection_sort;

import java.util.Scanner;

public class Selection_sort {

    public static void selcetor(int arr[]) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int arrsize;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array ");
        arrsize = s.nextInt();
        int arr[] = new int[arrsize];
        System.out.println("enter the element of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        selcetor(arr);
        System.out.println("sorted array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
