package Sorting.CountingSort;

import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        System.out.println("CountingSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        CountingSort(arr, 1, 10);

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }

    // Counting sort is an unstable Sorting algorithm.
    // It is also only good when the data set is small and within a predictable
    // range. e.g., values are always [1,10])
    private static void CountingSort(int[] arr, int min, int max) {
        int[] countArr = new int[ ( max - min ) + 1 ];

        // Count the numbers within the array
        for(int i : arr) {
            countArr[i - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++) {
            while( countArr[ i - min ] > 0 ) {
                arr[ j++ ] = i;
                countArr[ i - min ]--;
            }
        }
    }
}
