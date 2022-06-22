package practice;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Practice3 {
    public static void main(String[] args) {

    }

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i))
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
