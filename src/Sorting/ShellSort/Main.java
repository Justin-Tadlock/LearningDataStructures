package Sorting.ShellSort;

import static AuxPkg.AuxFuncs.auxIntArr;
import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    /*
        NOTE: ShellSort is an unstable worst case O(n^2), and a best case O(n log n) Sorting algorithm
        NOTE2: The gap value will indicate the number of steps this algorithm uses and thus impacts its performance
        NOTE3: The Knuth sequences for gap intervals is (3^k - 1)/ 2. For this example, we use arr.length / 2
    */
    public static void main(String[] args) {
        int[] arr = auxIntArr.clone();

        System.out.println("ShellSort:");
        System.out.print("Before: ");
        printIntArr(arr);

        //
        for(int gap = arr.length / 2; gap > 0; gap /= 2)
        {
            for(int i = gap; i < arr.length; i++)
            {
                int newValue = arr[i];

                int currIdx = i;
                while(currIdx >= gap && arr[currIdx - gap] > newValue)
                {
                    arr[currIdx] = arr[currIdx - gap];
                    currIdx -= gap;
                }

                arr[currIdx] = newValue;
            }
        }

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }
}
