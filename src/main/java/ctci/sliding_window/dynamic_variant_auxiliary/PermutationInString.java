package ctci.sliding_window.dynamic_variant_auxiliary;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int windowStart = 0;
        int[] map = new int[26];
        for (int i = 0; i < s1Len; i++) {
            map[s1.charAt(i) - 'a'] -= 1;
        }
        for (int windowEnd = 0; windowEnd < s2.length(); windowEnd++) {
            int rightChar = s2.charAt(windowEnd) - 'a';
            map[rightChar]++;

            while (map[rightChar] > 0) {
                map[s2.charAt(windowStart) - 'a']--;
                windowStart++;
            }
            if (s1Len == windowEnd - windowStart + 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
