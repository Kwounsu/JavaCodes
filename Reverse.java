public class Main {
    static void reverse(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
    static void reverse(int num) {
        String str = Integer.toString(num);
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverse(1234);
        reverse("drawer");
    }
}

//Kotlin
/*
fun reverse(str: String) {
    for (i in str.length-1 downTo 0) {
        print(str[i])
    }
    println()
}
fun reverse(num: Int) {
    var str = num.toString()
    for (i in str.length-1 downTo 0) {
        print(str[i])
    }
    println()
}

fun main(args: Array<String>) {
    reverse(1234)
    reverse("drawer")
}
*/
