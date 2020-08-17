public class Main {
    private static double squareRoot(double number) { 
        double temp, sr = number / 2;
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
        return sr;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(64.0));
    }
}

// Kotlin
/*
fun squareRoot(number: Double): Double {
    var sr: Double = number / 2
    var temp: Double = sr
    do {
        temp = sr
        sr = (temp + (number / temp)) / 2
    } while ((temp - sr) != 0.0)
    return sr
}

fun main(args: Array<String>) {
    val num = 64.0
    println(squareRoot(num))
}
*/
