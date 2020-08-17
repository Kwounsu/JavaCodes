fun armstrong(n: Int) {
    var num = n
    var tmp: Int
    var sum = 0
    
    while (num != 0) {
        tmp = num % 10
        num /= 10
        sum += tmp * tmp * tmp
    }
    
    if (sum == n) {
        println("$n is armstrong.")
    } else {
        println("$n is not armstrong.")
    }
}

fun main(args: Array<String>) {
    armstrong(153)
    armstrong(113)
}
