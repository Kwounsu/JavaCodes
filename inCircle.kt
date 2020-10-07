fun main(args: Array<String>) {
    val intArr_A = intArrayOf(100,200,100)
    val intArr_B = intArrayOf(50,100,100)
    val int_x = 110
    val int_y = 110
    println(solution(intArr_A,intArr_B,int_x,int_y))
}

fun solution(A:IntArray, B:IntArray, x:Int, y:Int): Int {
    for (i in 0..A.size-1) {
        if (inCircle(A[i],B[i],x,y)) {
            return i
        }
    }
    return -1
}

/* (x-center_x)^2 + (y-center_y)^2 < radius^2 */
fun inCircle (xo:Int, yo:Int, x:Int, y:Int): Boolean {
    val R = 20
    val dx = Math.abs(x-xo)
    val dy = Math.abs(y-yo)
    return (dx*dx + dy*dy <= R*R)
}
