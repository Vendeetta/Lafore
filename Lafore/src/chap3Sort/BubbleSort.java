package chap3Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 2, 1, 99};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
