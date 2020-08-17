public class Main {
    static void factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        factorial(7);
    }
}


// Kotlin
/*
fun factorial(n: Int) {
    var result = 1
    for (i in 2..n) {
        result *= i
    }
    println(result)
}

fun main(args: Array<String>) {
    factorial(7)
}
*/
