fun main(args: Array<String>) {
    rover(4,5)
}

fun rover(matrixSize: Int, commandsNum: Int) {
    // COMMANDS
    val commands = arrayOf("U","D","R","R","D","D","R","R","R")
    
    // Create matrix
    var matrix: MutableList<MutableList<Int>> = ArrayList()
    var num = 0
    for (i in 0..matrixSize-1) {
        var row: MutableList<Int> = ArrayList()
        for (j in 0..matrixSize-1) {
            row.add(num++)
        }
        matrix.add(row)
    }
    
    // Move the rover
    var x = 0
    var y = 0
    // for (i in commandsNum-1) {
    for (c in commands) {
        when (c) {
            "U" -> if(y > 0) y--
            "D" -> if(y < matrixSize-1) y++
            "R" -> if(x < matrixSize-1) x++
            else -> if(x > 0) x--
        }
    }
    
    // Get final location
    println("($x,$y)")
    println(matrix.elementAt(y).elementAt(x))
}
