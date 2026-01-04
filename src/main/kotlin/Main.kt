

fun main() {
    val (n,m,b) = readLine()!!.split(" ").map { it.toInt() }
    val c = b.toLong()
    val x = readLine()!!.split(" ").map { it.toLong() }
    val y = readLine()!!.split(" ").map { it.toLong() }
    var sumA = 0L
    var sumC = 0L

    for(i in 0 until n){
        sumA += x[i]
    }
    for(d in 0 until m){
        sumC += y[d]
    }
    println((sumA * m.toLong()) + (n.toLong() * m.toLong() * c) + (sumC * n.toLong()))
}

