package chap3Sort;

import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 2, 1, 99};
        oddEvenSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void oddEvenSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int j = 0; j < arr.length - 1; j += 2) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
            for (int j = 1; j < arr.length - 1; j += 2) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}
