package AuxPkg;

/*
* A class with static methods and structures to reduce duplication.
* This will allow for focus on topics and theories rather than writing redundant code.
* */
public class AuxFuncs {
    public static final int[] auxIntArr = { 20, 35, -15, 7, 55, 1, -22 };

    public static void swap(int[] arr, int idx, int newIdx)
    {
        if( idx == newIdx )
        {
            return;
        }

        int temp = arr[idx];
        arr[idx] = arr[newIdx];
        arr[newIdx] = temp;
    }

    public static void printIntArr(int[] arr)
    {
        String str = "";

        for(int i : arr) {
            str = String.format("%1$s%2$4d ", str, i);
        }

        System.out.println(str);
    }
}