fun main(args: Array<String>) {
    maximumPossibleInsert5(193)
}

fun maximumPossibleInsert5(N: Int) {
    var num = N
    
    //Negative handler
    var negative = 1
    if (num < 0) {
        negative = -1
        num *= -1
    }
    
    //Variables
    var result = Int.MIN_VALUE
    var IntLength = num.toString().length
    var position = 1
    
    //Iterate each number positions
    for (i in 0..IntLength) {
        val new = ((num/position)*position*10 + 5*position + num%position) * negative
        position *= 10
        println(new)
        if (new > result) {
            result = new
        }
    }
    println ("result = $result")
}

// Java
/*
public class Main {
    public static void maximumPossibleInsert5(int num) {
        //Negative handler
        int negative = 1;
        if (num < 0) {
            negative = -1;
            num *= -1;
        }
        
        //Variables
        int result = Integer.MIN_VALUE;
        int IntLength = String.valueOf(num).length();
        int position = 1;

        //Iterate each number positions
        for (int i = 0; i <= IntLength; i++) {
            int newValue = 
                ((num/position)*position*10 + 5*position + num%position) * negative;
            position *= 10;
            System.out.println(newValue);
            if (newValue > result) {
                result = newValue;
            }
        }
        System.out.println ("result = " + result);
    }
    
    public static void main(String[] args) {
        maximumPossibleInsert5(193);
    }
}
*/
