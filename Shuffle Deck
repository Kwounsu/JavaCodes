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
