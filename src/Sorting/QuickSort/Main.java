package Sorting.QuickSort;

import static AuxPkg.AuxFuncs.auxIntArr;
import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    public static void main(String[] args) {
        int[] arr = auxIntArr.clone();

        System.out.println("QuickSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        quickSort(arr, 0, arr.length);

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }

    // Quick sort is an unstable Sorting algorithm
    private static void quickSort(int[] arr, int start, int end) {
        if( end - start < 2 ) {
            return;
        }

        int pivot = partition(arr, start, end);

        // Left pivot
        quickSort(arr, start, pivot);

        // Right pivot
        quickSort(arr, pivot +1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        // Using the first element as the pivot of the logical sub-array
        int pivot = arr[start];

        int left = start;
        int right = end;

        while(left < right) {
            // Purposefully left empty to make sure the indexes don't cross over each other
            // Sort values to the left of the pivot point
            while( left < right && arr[--right] >= pivot) { }
            if( left < right ) {
                arr[left] = arr[right];
            }

            // Purposefully left empty to make sure the indexes don't cross over each other.
            // Sort values to the right of the pivot point
            while( left < right && arr[++left] <= pivot ) { }
            if( left < right ) {
                arr[right] = arr[left];
            }
        }

        // place the pivot element in the correct slot
        arr[right] = pivot;

        // return the index of the pivot
        return right;
    }
}
