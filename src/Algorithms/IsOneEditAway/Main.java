package Algorithms.IsOneEditAway;

import java.lang.Throwable;

public class Main {

    public static void main(String[] args) throws Throwable {
        // should return true
        if (!IsOneEditAway("abcde", "abcd")) {
            throw(new Throwable("Error, 'abcde','abcd' should return true.\n"));
        }

        // should return true
        if(!IsOneEditAway("abde", "abcde")) {
            throw(new Throwable("Error, 'abde','abcde' should return true.\n"));
        }

        // should return true
        if(!IsOneEditAway("a", "a")) {
            throw(new Throwable("Error, 'a','a' should return true.\n"));
        }

        // should return true
        if(!IsOneEditAway("abcdef", "abqdef")) {
            throw(new Throwable("Error, 'abcdef','abgef' should return true.\n"));
        }

        // should return true
        if(!IsOneEditAway("abcdef", "abccef")) {
            throw(new Throwable("Error, 'abcdef','abccef' should return true.\n"));
        }

        // should return true
        if(!IsOneEditAway("abcdef", "abcde")) {
            throw(new Throwable("Error, 'abcdef','abcde' should return true.\n"));
        }

        // should return false
        if(IsOneEditAway("aaa", "abc")) {
            throw(new Throwable("Error, 'aaa','abc' should return false.\n"));
        }

        // should return false
        if(IsOneEditAway("abcde", "abc")) {
            throw(new Throwable("Error, 'abcde','abc' should return false.\n"));
        }

        // should return false
        if(IsOneEditAway("abc", "abcde")) {
            throw(new Throwable("Error, 'abc','abcde' should return false.\n"));
        }

        // should return false
        if(IsOneEditAway("abc", "bcc")) {
            throw(new Throwable("Error, 'abc','bcc' should return false.\n"));
        }
    }

    private static Boolean IsOneEditAway(String s1, String s2) {

        if(s1.length() == 1 && s2.length() == 1) {
            return true;
        }
        if(s1.length() >= s2.length() + 2 || s2.length() >= s1.length() + 2) {
            return false;
        }

        int editCount = 0;
        int p1 = 0;
        int p2 = 0;

        while(p1 < s1.length() && p2 < s2.length()) {
            if(s1.charAt(p1) == s2.charAt(p2)) {
                p1++;
                p2++;
            }
            else if(s1.charAt(p1) != s2.charAt(p2)) {
                editCount++;

                if(s1.length() > s2.length()) {
                    p1++;
                }
                else if(s2.length() > s1.length()) {
                    p2++;
                }
                else {
                    p1++;
                    p2++;
                }
            }
        }

        return editCount <= 1;
    }
}
