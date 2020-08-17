public class Main {
    static void prime(int num) {
        boolean flag = true;
        
        for(int i = 2; i < num; i++) {
            if(num%i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
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
