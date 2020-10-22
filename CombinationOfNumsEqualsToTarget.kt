/*
 * You were given one array and one target number. 
 * Find combination where the sum of the three Numbers is equal to the target value.
 */

fun main(args: Array<String>) {
    val nums = listOf(1,2,3,4,5,6,7)
    val target = 12
    val numberOfNums = 3
    solution(nums, target, numberOfNums)
}

fun solution(nums: List<Int>, target: Int, numberOfNums: Int) {
    val permutes: Set<Set<Int>> = permutation(nums, numberOfNums)
    for (permute in permutes) {
        var sum = 0
        for (num in permute) {
            sum += num
        }
        if (sum == target) {
            println (permute)
        }
    }
}

fun permutation (nums: List<Int>, numberOfNums: Int): Set<Set<Int>> {
    val permutes = mutableSetOf<Set<Int>>()
    for (i in (1 shl numberOfNums)-1..(1 shl nums.size)-1) {
        val sublist = mutableSetOf<Int>()
        for (j in 0..nums.size-1) {
            if ((i and (1 shl j)) > 0) {
                sublist.add(nums[j])
            }
        }
        if (sublist.size == numberOfNums) {
            permutes.add(sublist)
        }
    }
    return permutes
}
