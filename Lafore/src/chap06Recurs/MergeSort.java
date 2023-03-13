package chap06Recurs;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] abc = {2, 3, 1, 5, 0};
        mergeSort(abc);
        System.out.println(Arrays.toString(abc));
    }

    public static void mergeSort(int[] array) {
        int[] workspace = new int[array.length];
        recMergeSort(array, workspace, 0, workspace.length - 1);

    }

    private static void recMergeSort(int[] array, int[] workSpace, int lower, int upper) {
        if (lower != upper) {
            int mid = (lower + upper) / 2;
            recMergeSort(array, workSpace, lower, mid);
            recMergeSort(array, workSpace, mid + 1, upper);
            merge(array, workSpace, lower, mid + 1, upper);

        }
    }

    private static void merge(int[] array, int[] workspace, int lwStart, int hgStart, int hgEnd) {
        int j = 0;
        int lowerBound = lwStart;
        int mid = hgStart - 1;
        int n = hgEnd - lowerBound + 1;

        while (lwStart <= mid && hgStart <= hgEnd) {
            if (array[lwStart] < array[hgStart])
                workspace[j++] = array[lwStart++];
            else
                workspace[j++] = array[hgStart++];
        }
        while (lwStart <= mid) {
            workspace[j++] = array[lwStart++];
        }
        while (hgStart <= hgEnd) {
            workspace[j++] = array[hgStart++];
        }

        for (j = 0; j < n; j++) {
            array[lowerBound + j] = workspace[j];
        }
    }
}
