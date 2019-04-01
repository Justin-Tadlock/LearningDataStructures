package Algorithms.FindMostFrequent;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,3,2,1};

        System.out.println("Most Frequent Num: " + FindMostFrequent(arr));
    }

    private static Integer FindMostFrequent(int[] givenArray) {
        Integer maxItem = givenArray[0];
        Integer maxCount = 1;

        if(givenArray.length == 0) {
            return null;
        }
        if(givenArray.length == 1) {
            return 0;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer i : givenArray) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            }
            else {
                hm.put(i, 1);
            }

            if(hm.get(i) > maxCount) {
                maxCount = hm.get(i);
                maxItem = i;
            }
        }

        /*
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for(int i = 0; i < givenArray.length; i++) {
            if(ht.containsKey(givenArray[i])) {
                ht.put(givenArray[i], ht.get(givenArray[i]) + 1);
            }
            else {
                ht.put(givenArray[i], 1);
            }

            if(ht.get(givenArray[i])) > ht.get(maxItem.intValue())) {
                maxItem = givenArray[i];
            }
        }
        */
        return maxItem;
    }
}
