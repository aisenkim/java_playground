public class SolutionCodility {

    public int solution(int N) {
        // First determine if it's negative or positive
        StringBuilder numStr = new StringBuilder(Integer.toString(N));
//        StringBuilder copy = new StringBuilder(numStr);
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '5') {
                StringBuilder copy = new StringBuilder(numStr);
                String temp = copy.deleteCharAt(i).toString();
                int convertedNum = Integer.parseInt(temp);
                maxValue = Math.max(maxValue, convertedNum);
            }
        }

        return maxValue;
    }

}
