package Algorithms.FindNonRepeatingChar;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Should return c: " + nonRepeating("abcab")); // should return 'c'
        System.out.println("Should return null: " + nonRepeating("abab")); // should return null
        System.out.println("Should return c: " + nonRepeating("aabbbc")); // should return 'c'
        System.out.println("Should return d: " + nonRepeating("aabbdbc")); // should return 'd'
    }

    private static Character nonRepeating(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        Character ret = s.charAt(0);

        for(int i = 'a'; i <= 'z'; i++) {
            hm.put((char)i, 0);
        }

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            hm.put(c, hm.get(c) + 1);


            if(hm.get(c) < hm.get(ret)) {
                ret = c;
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }

        return null;
    }
}
