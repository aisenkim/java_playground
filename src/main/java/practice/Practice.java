package practice;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        List<List<String>> result = groupAnagrams(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        System.out.println("result = " + result);
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> result = new ArrayList<>();
        // Store into hashmap [key -> first occurence]
        Map<Integer, List<String>> map = new HashMap<>();
        // [value -> list of occurence]
        for(String word : words) {
            int wordNum = wordToInteger(word);
            if(map.containsKey(wordNum)) {
                List<String> mapValue = map.get(wordNum);
                mapValue.add(word);
                map.put(wordNum, mapValue);
            } else {
                map.put(wordNum, new ArrayList<>(List.of(word)));
            }
        }

        for(Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    private static int wordToInteger(String word) {
        int charTotal = 0;
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            charTotal += c;
        }
        return charTotal;
    }
}
