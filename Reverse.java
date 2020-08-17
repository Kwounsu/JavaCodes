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
    
    static void reverse(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverse(1234);
        reverse("drawer");
        int[] arr = {1,2,3,4};
        reverse(arr);
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
fun reverse(arr: IntArray) {
    var list: MutableList<Int> = ArrayList()
    for (i in arr.size-1 downTo 0) {
        list.add(arr[i])
    }
    println(list)
}

fun main(args: Array<String>) {
    reverse(1234)
    reverse("drawer")
    val array = intArrayOf(1,2,3,4)
    reverse(array)
}
*/
