import java.util.HashMap; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import java.util.stream.Collectors; 
import static java.util.stream.Collectors.*;

public class Main {
    static void printOccurence(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // Count the occurence
        for (int i = 0; i < array.length; i++){
            int number = array[i];
            if (map.containsKey(number)) {
                int count = map.get(number);
                map.remove(number);
                map.put(number,count+1);
            } else {
                map.put(number,1);
            }
        }
        
        // Sort in descending order
        Map<Integer, Integer> sortedByValueDesc = 
            map.entrySet().stream().sorted(
            Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(toMap(Map.Entry::getKey, 
                           Map.Entry::getValue, 
                           (e1, e2) -> e1, 
                           LinkedHashMap::new));
        
        // Print
        for (Integer key : sortedByValueDesc.keySet()) {
			System.out.println(key+":"+sortedByValueDesc.get(key));
		}
    }
    
    public static void main(String[] args) {
        int[] intArray = new int[]{ 21,24,12,132,1,21,2,2,3,2,12,8,9,10 };
        printOccurence(intArray);
    }
}

// Kotlin
/*
fun printOccurence(arr: IntArray) {
    val items = HashMap<Int, Int>()
    
    // Count the occurence
    for (i in 0..arr.size-1) {
        var item = arr[i]
        if (items.containsKey(item)) {
            var count = items.get(item)
            items.remove(item)
            items.put(item, count!!.plus(1))
        } else {
            items.put(item, 1)
        }
    }
    
    // Sort in descending order
    val sortedItems = items.toList()
        .sortedByDescending { (key, value) -> value }
        .toMap()
    
    // Print
    for (item in sortedItems) {
        println(item)
    }
}

fun main(args: Array<String>) {
    var arr: IntArray = intArrayOf(21,24,12,132,1,21,2,2,3,2,12,8,9,10)
    printOccurence(arr)
}
*/
