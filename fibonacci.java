public class Main {
    public static int fib(int number){ 
        if(number == 1 || number == 2){ 
            return 1; 
        } 
        return fib(number-1) + fib(number -2);
    }
    
    public static void fibonacci(int num) {
        for (int i = 1; i < num; i++) {
            System.out.println(fib(i));
        }
    }
    
    public static void main(String[] args) {
        fibonacci(10);
    }
}
