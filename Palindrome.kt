fun palindrome(str: String) {
    var flag = true
    for (i in 0..(str.length/2-1)) {
        if(str[i] != str[str.length-1-i]) {
            flag = false
            break
        }
    }
    if (flag == true) {
        println("$str is palindrome.")
    } else {
        println("$str is not palindrome.")
    }
}

fun main(args: Array<String>) {
    palindrome("Hello")
    palindrome("BOB")
}
