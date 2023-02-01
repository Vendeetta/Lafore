package chap3Sort;

import java.util.Arrays;

public class DoubleBubbleSort {
    public static void bubbleSort(int[] arr) {
        int out, in;
        int secOut = 0;
        for (out = arr.length - 1; out > 1; out--) {

            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int tmp = arr[in + 1];
                    arr[in + 1] = arr[in];
                    arr[in] = tmp;
                }
            }
            for (; in > secOut; in--){
                if (arr[in] < arr[in - 1]) {
                    int tmp = arr[in - 1];
                    arr[in - 1] = arr[in];
                    arr[in] = tmp;
                }
            }
            secOut++;
        }
    }

    public static void main(String[] args) {
        int[] array = {88, 5, 6, 7, 2, 1, 3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
