package Algorithms.FindCommonElements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Common elements;");
        Integer[] a = FindCommonElements(new int[] {1,3,4,6,7,9}, new int[] {1,2,4,5,9,10});
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static Integer[] FindCommonElements(int[] A, int[] B) {
        Integer[] resultInArray;
        ArrayList<Integer> t = new ArrayList<>();

        // Tracking indexes for arrays
        int iA = 0;
        int iB = 0;

        // Search for common elements
        while(iA < A.length && iB < B.length) {
            if(A[iA] == B[iB]) {
                t.add(A[iA]);
                iA++;
                iB++;
            }
            else if( A[iA] > B[iB] ) {
                iB++;
            }
            else {
                iA++;
            }
        }

        resultInArray = new Integer[t.size()];
        for(int i = 0; i < t.size(); i++) {
            resultInArray[i] = t.get(i);
        }
        return resultInArray;
    }

}
