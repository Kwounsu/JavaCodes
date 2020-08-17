fun canFormPalindrome(str: String): Boolean {
    var chars = mutableListOf<Char>()
    for (char in str) {
        if (chars.contains(char)) {
            chars.remove(char)
        } else {
            chars.add(char)
        }
    }
    if (chars.size > 1) {
        return false
    } else {
        return true
    }
}

fun main(args: Array<String>) {
    println(canFormPalindrome("edcabbbacd"))
}
