import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<String>(52);
        createDeck(deck);
        System.out.println(deck);
        shuffleDeck(deck);
        System.out.println(deck);
    }
    
    public static ArrayList<String> createDeck(ArrayList<String> deck) {
        List<String> suits = Arrays.asList(new String[]{"♠", "♥", "♦", "♣"});
        List<String> nums = Arrays.asList(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"});
        for (String suit : suits) {
            for (String num : nums) {
                deck.add(suit + num);
            }
        }
        return deck;
    }
    
    public static ArrayList<String> shuffleDeck(ArrayList<String> deck) {
        // start from end of the list
        for (int i = deck.size()-1; i >= 1; i--)
        {
            // get random number
            Random rand = new Random(); 
            int j = rand.nextInt(i+1);
            
            // swap i and j
            Collections.swap(deck, i, j);
        }
        return deck;
    }
}

// Kotlin
/*
fun main() {
    var deck: MutableList<String> = ArrayList()
    create(deck)
    println(deck)
    shuffle(deck)
    println(deck)
}

fun create(deck: MutableList<String>) {
    val suits = listOf("♠", "♥", "♦", "♣")
    val nums = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    for (suit in suits)
        for (num in nums)
            deck.add(suit+num)
}

fun shuffle(deck: MutableList<String>) {
    val rand = (0..52).random()
    
	// start from end of the list
	for (i in deck.size - 1 downTo 1) {
		// get a random index j such that 0 <= j <= i
		val j = (0..i+1).random()

		// swap element at i'th position in the list with element at j'th position
		val temp = deck[i]
		deck[i] = deck[j]
		deck[j] = temp
	}
}
*/
