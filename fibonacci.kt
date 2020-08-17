fun main(args: Array<String>) {
    fibonacci(10)
}

fun fibonacci(num: Int) {
    for (i in 1..num) {
        println(fib(i))
    }
}

fun fib(num: Int): Int {
    if (num == 1 || num == 2) {
        return 1
    }
    return fib(num-1) + fib(num-2)
}
