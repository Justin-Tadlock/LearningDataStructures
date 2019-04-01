package Algorithms.FindHappyNumber;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("Happy Number: %s", isHappyNumber(25).toString()));
        System.out.println(String.format("Happy Number: %s", isHappyNumber(1).toString()));
    }

    public static Boolean isHappyNumber(Integer num) {
        String digit;
        Integer sum = num;

        Hashtable<Integer, Integer> sumTable = new Hashtable<>();

        if(num < 0) {
            return false;
        }

        String n;
        while(true) {
            n = sum.toString();
            sum = 0;

            for(int i = 0; i < n.length(); i++) {
                digit = String.format("%s", n.charAt(i));
                sum += (int)Math.pow(Integer.parseInt(digit), 2);
            }

            if(sum == 1)
            {
                return true;
            }
            else if(!sumTable.containsKey(sum)) {
                sumTable.put(sum,1);
            }
            else {
                return false;
            }
        }
    }
}
