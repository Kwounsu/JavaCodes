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
