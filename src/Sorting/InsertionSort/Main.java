package Sorting.InsertionSort;

import static AuxPkg.AuxFuncs.auxIntArr;
import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    // NOTE: InsertionSort is a stable O(n^2) Sorting algorithm
    public static void main(String[] args) {
        // NOTE: auxIntArr is found in AuxPkg.AuxFuncs
        int[] arr = auxIntArr.clone();

        System.out.println("InsertionSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        // Main loop:
        // Assumption, first unsorted index is 1 because the sorted partition is
        // starting at position 1.
        for( int firstUnsortedIdx = 1;
             firstUnsortedIdx < arr.length;
             firstUnsortedIdx++)
        {
            int newValue = arr[firstUnsortedIdx];

            int i;

            // Shifting the sorted partition to the right until all values are sorted correctly
            for( i = firstUnsortedIdx;
                 i > 0 && arr[i - 1] > newValue;
                 i--)
            {
                arr[i] = arr[i-1];
            }

            // Insert the new value into the correct position
            arr[i] = newValue;
        }

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }
}
