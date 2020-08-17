public class Main {
    public static int fib(int num){ 
        if(num == 1 || num == 2){ 
            return 1; 
        } 
        return fib(num-1) + fib(num -2);
    }
    
    public static void fibonacci(int number) {
        for (int i = 1; i < number; i++) {
            System.out.println(fib(i));
        }
    }
    
    public static void main(String[] args) {
        fibonacci(10);
    }
}
