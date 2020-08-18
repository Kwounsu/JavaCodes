/*
 * Best Time to Buy and Sell Stock III
 * find the maximum profit with at most two transactions.
 */

public class Main {
    public static void main(String[] args) {
        int prices[] = {3,3,5,0,0,3,1,4};
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        
        for(int i:prices){
            release2 = Math.max(release2, hold2+i);
            hold2    = Math.max(hold2,    release1-i);
            release1 = Math.max(release1, hold1+i);
            hold1    = Math.max(hold1,    -i);
        }
        System.out.println("Max Profit: "+release2);
    }
}
