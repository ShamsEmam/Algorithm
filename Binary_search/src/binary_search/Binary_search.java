package binary_search;

import static java.time.Clock.system;
import java.util.Scanner;

public class Binary_search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Gusse your number");
        Scanner input = new Scanner(System.in);
        int searchKey = 2;
        searchKey = input.nextInt();
        System.out.println(ArraySearch(arr, searchKey));
    }

    public static int ArraySearch(int[] arr, int searchKey) {
        int lower = 0;
        int upper = arr.length - 1;
        int index = 0;
        while (true) {
            index = (lower + upper) / 2;
            if (searchKey == arr[index]) {
                return index;
            } else if (lower>upper) {
                return -1;
            } else if (searchKey > arr[index]) {
                lower = index + 1;
            } else if (searchKey < arr[index]) {
                upper = index - 1;
            }
        }

    }
}
