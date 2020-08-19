fun main(args: Array<String>) {
    val T = readLine()!!.toInt()
    for (i in 0..T-1) {
        val N = readLine()!!.toInt()
        trappedWater(N)
    }
}

fun trappedWater(N: Int) {
    // Variables
    val str = readLine()
    var blocks = ArrayList<Int>()
    var water = 0
    var left = 0
    var right = N-1
    var maxLeft = 0
    var maxRigth = 0
    
    // Convert string to intArray
    for (i in 0..str!!.length-1) {
        if (!str[i].isWhitespace())
            blocks.add(str[i].toString().toInt())
    }

    // Calculate trapped water
    while (left < right) {
        if (blocks[left] <= blocks[right]) {
            if (blocks[left] >= maxLeft) maxLeft = blocks[left]
            else water += maxLeft - blocks[left]
            left++
        } else {
            if (blocks[right] >= maxRigth) maxRigth = blocks[right]
            else water += maxRigth - blocks[right]
            right++
        }
    }

    // Print trapped water
    println (water)
}
