package ctci.sliding_window.dynamic_variant_auxiliary;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring with K distinct Characters
 * https://www.youtube.com/watch?v=MK-NZ4hN7rs
 */
public class LongestSubstringWithDistinctChars {

    public static int longestSubstringWithDistinctChar(String str, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int maxLength = Integer.MIN_VALUE;
        for (int windowEnd = 0; windowEnd <str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            while(map.size() > k) {
                char leftChar = str.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) map.remove(leftChar);
                windowStart++;
            }
           maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "AAAHHIBC";
        System.out.println( longestSubstringWithDistinctChar(str, 2));
    }
}
