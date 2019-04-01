package Algorithms.IsRotation;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {4,5,6,7,1,2,3};
        int[] arr3 = {4,5,6,7,8,9,10};
        System.out.println("Are Arrays Rotations: " + IsRotation(arr1, arr2));
        System.out.println("Are Arrays Rotations: " + IsRotation(arr2, arr1));
        System.out.println("Are Arrays Rotations: " + IsRotation(arr2, arr3));
        System.out.println("Are Arrays Rotations: " + IsRotation(arr1, arr3));
    }

    private static boolean IsRotation(int[] A, int[]B) {
        boolean ret = false;

        int p1 = 0;
        int p2 = 0;

        if(A.length != B.length) {
            return false;
        }

        for( int i = 0; i < B.length; i++) {
            if(A[p1] == B[i]) {
                p2 = i;
                break;
            }
        }

        while(p1 < A.length) {
            if(A[p1] == B[p2]) {
                ret = true;
                p1++;
                p2 = (p2 + 1) % B.length;
            }
            else {
                ret = false;
                break;
            }
        }

        return ret;
    }

}
