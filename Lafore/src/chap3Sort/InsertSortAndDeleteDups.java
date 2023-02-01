package chap3Sort;

import java.util.Arrays;

public class InsertSortAndDeleteDups {

    public static void insertSortAndDeleteDups(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int tmp = arr[i];
            while (j > 0 && arr[j-1] >= tmp){
                if(arr[j - 1] == tmp && arr[j - 1] != -1) {
                    tmp = -1;
                    count++;
                }
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - count; i++) {
            arr[i] = arr[i + count];
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 6, 2, 1, 99};
        insertSortAndDeleteDups(array);
        System.out.println(Arrays.toString(array));
    }
}
