package linearsearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        {
            int arr[] = {50, 20, 40, 8, 60};
            System.out.println("Guess a number ");
            Scanner input = new Scanner(System.in);
            int key;
            key = input.nextInt();
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("founf at index " + i);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("not found ");
            }
        }
    }

}
