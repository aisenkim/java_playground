package practice;

import java.util.HashMap;

public class Practice4 {

    public static void main(String[] args) {
        String s = "abbac";
        int result = firstUniqChar(s);
        System.out.println("result = " + result);
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> alphas = new HashMap<>();
        int xored = 0;
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            alphas.put(currentChar, i);
            xored ^= currentChar;
        }
        if(xored == 0) return -1;
        char result = (char) xored;
        return alphas.get(result);
    }
}
