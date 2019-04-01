package Sorting.MergeSort;

import static AuxPkg.AuxFuncs.auxIntArr;
import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    public static void main(String[] args) {
        int[] arr = auxIntArr.clone();

        System.out.println("MergeSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        MergeSort(arr, 0, arr.length);

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }

    // Merge Sort is a stable Sorting algorithm
    private static void MergeSort(int[] arr, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        // Split left
        MergeSort(arr, start, mid);

        // Split right
        MergeSort(arr, mid, end);

        // Merge left and right arrays
        Merge(arr, start, mid, end);
    }

    private static void Merge(int[] arr, int start, int mid, int end) {
        if(arr[mid - 1] <= arr[mid]) {
            return;
        }

        int left = start;
        int right = mid;
        int tempIdx = 0;

        int[] tempArr = new int[end - start];

        while(left < mid && right < end) {
            tempArr[tempIdx++] = arr[left] <= arr[right] ? arr[left++] : arr[right++];
        }

        // Handle remaining elements
        System.arraycopy(arr, left, arr, start + tempIdx, mid - left);

        // Merge the two arrays
        System.arraycopy(tempArr, 0, arr, start, tempIdx);
    }
}
