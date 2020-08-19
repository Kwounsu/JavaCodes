fun prime(num: Int) {
    var flag = true

    for(i in 2..num-1) {
        if(num%i == 0) {
            flag = false
            break
        }
    }
    
    if (flag) {
        println(num.toString() + " is prime.")
    }
    else {
        println(num.toString() + " is not prime.")
    }
}

fun main(args: Array<String>) {
    prime(12)
    prime(13)
}
