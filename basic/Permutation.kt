fun main(args: Array<String>) {
    println(consecutivePermutations("abcd"))
    println(printSubsets(listOf('a','b','c','d')))
}

fun consecutivePermutations(s: String): Set<String> {
    val permutes = mutableSetOf<String>()
    for (i in 1..s.length) {
        for (j in 0..s.length-i) {
            permutes.add(s.substring(j, j+i))
        }
    }
    return permutes
}

fun consecutivePermutations(list: List<Char>): Set<List<Char>> {
    val permutes = mutableSetOf<List<Char>>()
    for (i in 1..list.size) {
        for (j in 0..list.size-i) {
            permutes.add(list.subList(j, j+i))
        }
    }
    return permutes
}

// For each element, you have two choices: 
// either you put it in your subset, or you don't.
// Therefore, number of subsets will be 2^n

fun permutations(s: String): Set<String> {
    val permutes = mutableSetOf<String>()
    for (i in 0..(1 shl s.length)-1) {
        var subset = ""
        for (j in 0..s.length-1) {
            if ((i and (1 shl j)) > 0) {
                subset += "${s[j]}"
            }
        }
        permutes.add(subset)
    }
    return permutes
}

fun permutations(list: List<Char>): Set<List<Char>> {
    val permutes = mutableSetOf<List<Char>>()
    for (i in 0..(1 shl list.size)-1) {
        val subset = mutableListOf<Char>()
        for (j in 0..list.size-1) {
            if ((i and (1 shl j)) > 0) {
                subset.add(list[j])
            }
        }
        permutes.add(subset)
    }
    return permutes
} 
