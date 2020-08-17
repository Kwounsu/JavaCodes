/*
 * Find Greatest common divisor (GCD) using Euclid's algorithm
 */
public class Main {
    private static int GCD(int number1, int number2) { 
        if(number2 == 0){ 
            return number1; 
        } 
        return findGCD(number2, number1%number2); 
    }

    public static void main(String[] args) {
        System.out.println(GCD(56,32));
    }
}
