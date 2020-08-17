public class Main {
    static void armstrong(int n) {
        int num = n, tmp, sum = 0;
        while (num != 0) {
            tmp = num % 10;
            num /= 10;
            sum += tmp * tmp * tmp;
        }
        if (sum == n) {
            System.out.println(n + " is armstrong.");
        } else {
            System.out.println(n + " is not armstrong.");
        }
    }
    
    public static void main(String[] args) {
        armstrong(153);
        armstrong(113);
    }
}
