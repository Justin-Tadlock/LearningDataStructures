package Sorting.RadixSort;

import static AuxPkg.AuxFuncs.printIntArr;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4725, 4586, 1330, 8782, 1594, 5729 };

        System.out.print("Before: ");
        printIntArr(arr);

        //

        System.out.print("After:  ");
        printIntArr(arr);
        System.out.println();
    }

    private static void radixSingleSort(int[] input, int pos, int radix) {
        int numItems = input.length;

        int[] countArr = new int[radix];

        for(int val: input) {
            countArr[getDigit(pos, val, radix)]++;
        }
    }


    private static int getDigit(int pos, int val, int radix) {
        return (val / (int) Math.pow(10, pos)) % radix;
    }
}
