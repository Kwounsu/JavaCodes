import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] subarray = Arrays.copyOfRange(arr, i, j+1);
                int sum = 0;
                for (int ele: subarray) {
                    sum += ele;
                }
                if (sum < 0) result++;
            }
        }
        System.out.println(result);
    }
}
