package Sorting.BubbleSort;

import static AuxPkg.AuxFuncs.*;

public class Main {
    // NOTE: BubbleSort is a stable O(n^2) Sorting algorithm.
    public static void main(String[] args) {
        // auxIntArr is found in AuxPkg.AuxFuncs
        int[] arr = auxIntArr.clone();

        System.out.println("BubbleSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        // Main loop where the index will grow smaller as the array gets sorted
        for( int lastUnsortedIdx = arr.length -1;
             lastUnsortedIdx > 0;
             lastUnsortedIdx--)
        {
            // Nested loop for bubbling highest values to the next sorted slot
            // in the main loop
            for(int idx = 0; idx < lastUnsortedIdx; idx++)
            {
                if(arr[idx] > arr[idx+1])
                {
                    swap(arr, idx, idx+1);
                }
            }
        }

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }
}
