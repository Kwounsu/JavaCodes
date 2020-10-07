fun main(args: Array<String>) {
    println(permutations("abcd"))
    println(permutations(listOf('a','b','c','d')))
}

fun permutations(s: String): Set<String> {
    val permutes = mutableSetOf<String>()
    for (i in 1..s.length) {
        for (j in 0..s.length-i) {
            permutes.add(s.substring(j, j+i))
        }
    }
    return permutes
}

fun permutations(list: List<Char>): Set<List<Char>> {
    val permutes = mutableSetOf<List<Char>>()
    for (i in 1..list.size) {
        for (j in 0..list.size-i) {
            permutes.add(list.subList(j, j+i))
        }
    }
    return permutes
}
