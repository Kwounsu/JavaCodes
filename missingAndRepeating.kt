fun main(args: Array<String>) {
    val T = readLine()
    missingAndRepeating(T?.toInt() ?: 0)
}

fun missingAndRepeating(T: Int) {
    for (i in 0..T-1) {
        // Get the size of array N
        val N = readLine()!!.toInt()
        
        // Get the array nums
        val numbers = readLine()
        var nums = ArrayList<Int>()
        for (i in 0..numbers!!.length-1) {
            if (!numbers[i].isWhitespace())
                nums.add(numbers[i].toString().toInt())
        }
        
        // find missing A and repeating B
        nums.sort()
        var A = nums[N-1] - N + 1
        if (A < 1) A = nums[0]
        var B = -1
        for (i in 0..N-2) {
            if (A == nums[i]) A++
            if (nums[i] == nums[i+1]) {
                    B = nums[i]
            }
        }
        if (A == nums[N-1]) A++
        
        // Print repeating B and missing A
        println ("$B $A")
    }
}
