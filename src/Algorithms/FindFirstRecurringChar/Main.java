package Algorithms.FindFirstRecurringChar;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.printf("First Recurring character is: %s%n", FindFirstRecurringChar("TESTER"));
        System.out.printf("First Recurring character is: %s%n", FindFirstRecurringChar("TESSTER"));
    }

    private static Character FindFirstRecurringChar(String str) {

        Hashtable<Character, Integer> ht = new Hashtable<>();

        for(int i = 'A'; i <= 'Z'; i++) {
            ht.put((char)i, 0);
        }

        String temp = str.toUpperCase();
        for(int i = 0; i < str.length(); i++) {
            char c = temp.charAt(i);
            ht.put(c, ht.get(c) + 1);

            if(ht.get(c) > 1) {
                return c;
            }
        }

        return null;
    }

}
