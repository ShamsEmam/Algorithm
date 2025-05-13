package mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int arr1[] = {4,3,2,1};
        MergeSort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void MergeSort(int[] list) {
        if (list.length > 1) {

            int[] firsthalf = new int[(list.length) / 2];
            System.arraycopy(list, 0, firsthalf, 0, firsthalf.length);
            MergeSort(firsthalf);

            int[] sechalf = new int[(list.length / 2) + (list.length % 2)];
            System.arraycopy(list, firsthalf.length, sechalf, 0, sechalf.length);
            MergeSort(sechalf);
            Merge(firsthalf, sechalf, list);
        }
    }

    public static void Merge(int[] arr1, int[] arr2, int[] mergearr) {
        int x = 0, y = 0, z = 0;
        while (x < arr1.length && y < arr2.length) {
            if (arr1[x] < arr2[y]) {
                mergearr[z++] = arr1[x++];

            } else {
                mergearr[z++] = arr2[y++];
            }
        }
        while (x < arr1.length) {
            {
                mergearr[z++] = arr1[x++];
            }
        }
        while (y < arr2.length) {
            {
                mergearr[z++] = arr2[y++];
            }
        }
    }
}
