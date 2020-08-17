public class Main {
    static int[] removeDuplicate(int arr[]) {
        Arrays.sort(arr);
        int newArraySize = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                newArraySize++;
            }
        }
        int[] newArray = new int[newArraySize]; 
        newArray[0] = arr[0];
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                newArray[n] = arr[i];
                n++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,1,5,3,4,2,4};
        arr = removeDuplicate(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//Kotlin
/*
fun removeDuplicate(arr: IntArray): IntArray {
    arr.sort()
    var newArraySize = 1;
    for (i in 1..arr.size-1) {
        if (arr[i] != arr[i-1]) {
            newArraySize++
        }
    }
    val newArray = IntArray(newArraySize)
    newArray[0] = arr[0]
    var n = 1
    for (i in 1..arr.size-1) {
        if (arr[i] != arr[i-1]) {
            newArray[n++] = arr[i]
        }
    }
    return newArray
}

fun main(args: Array<String>) {
    var arr: IntArray = intArrayOf(4,2,1,5,3,4,2,4)
    arr = removeDuplicate(arr)
    for (ele in arr) {
        println(ele)
    }
}
*/
