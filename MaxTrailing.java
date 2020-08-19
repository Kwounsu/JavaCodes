class Result {
    public static int maxTrailing(List<Integer> levels) {
        int maxDiff = 0, max = levels.get(levels.size()-1);
        for (int i = levels.size()-2; i >= 0; i--) {
            if (max < levels.get(i)) max = levels.get(i);
            else {
                int diff = max - levels.get(i);
                if (diff > maxDiff) maxDiff = diff;
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

// Kotlin
/*
fun main(args: Array<String>) {
    val levels = listOf(2,3,10,2,4,8,1)
    println(maxTrailing(levels))
}

fun maxTrailing(levels : List<Int>): Int {
    var maxDiff = 0 
    var max = levels[levels.size-1]
    for (i in levels.size-2 downTo 0) {
        if (max < levels[i]) max = levels[i]
        else {
            var diff = max - levels[i]
            if (diff > maxDiff) maxDiff = diff
        }
    }
    if (maxDiff > 0) return maxDiff
    return -1;
}
*/
