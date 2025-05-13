package bubbulsort;

import java.util.Scanner;

public class Bubbulsort {

    public static void Bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrSize;
        Scanner x = new Scanner(System.in);
        System.out.println("enter array size");
        arrSize = x.nextInt();
        int arr[] =new int[arrSize];
        System.out.println("enter arrayy element");
        for(int i=0 ;i<arr.length;i++){
            arr[i]=x.nextInt();
        }
        Bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
