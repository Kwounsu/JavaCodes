class Result {
    public static int maxTrailing(List<Integer> levels) {
        int maxDiff = 0;
        for (int i = levels.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int num1 = levels.get(i), num2 = levels.get(j);
                if (num1 > num2 && (num1 - num2) > maxDiff) {
                    int diff = num1 - num2;
                    if (diff > maxDiff) maxDiff = diff;
                }
            }
        }
        if (maxDiff > 0) return maxDiff;
        return -1;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> levels = Arrays.asList(new Integer[]{2,3,10,2,4,8,1});

        int result = Result.maxTrailing(levels);
        System.out.println("Result: " + result);
    }
}
