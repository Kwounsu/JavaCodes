public class Main {
//     boolean isPrime(n) {
//         if (n == 2) return true;
//         if (n < 2 || n % 2 == 0) return false;
//         for (int i = 3; i <= (int) Math.sqrt(n); i += 2){
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
    
    boolean isPrime(n) {
        for(int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    
    static void prime(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        }
        else {
            System.out.println(num + " is not prime.");
        }
    }
    
    public static void main(String[] args) {
        prime(3);
        prime(10);
    }
}
