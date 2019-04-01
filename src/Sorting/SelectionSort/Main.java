package Sorting.SelectionSort;

import static AuxPkg.AuxFuncs.*;

public class Main {
    // NOTE: SelectionSort is an unstable O(n^2) Sorting algorithm.
    public static void main(String[] args) {
        // auxIntArr is found in auxfuncs
        int[] arr = auxIntArr.clone();

        System.out.println("SelectionSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        // Main loop where the index will grow smaller as the values get sorted
        for( int lastUnsortedIdx = arr.length - 1;
             lastUnsortedIdx > 0;
             lastUnsortedIdx--)
        {
            int largest = 0;

            // Nested loop where the highest value index is found
            // Note: This is unstable due to <=, meaning that the compared values,
            //       when equal, could switch index slots, causing "referential
            //       integrity" to break if used to sort objects by two categories
            //       such as "Date then Title" for books.
            for(int i = 1; i <= lastUnsortedIdx; i++)
            {
                if(arr[i] > arr[largest])
                {
                    largest = i;
                }
            }

            // Once the highest value is found, we place it in the sorted value index.
            swap(arr, largest, lastUnsortedIdx);
        }

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }
}
