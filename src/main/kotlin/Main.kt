

import kotlin.math.max

fun main() {
    val n = readLine()!!.toLong()
    val a = n / 3
    val b = n / 5
    val c = n / 15

    val ans = a + b - c
    println(ans)
}