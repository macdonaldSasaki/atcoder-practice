

import kotlin.math.max

fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toLong()
    val r = input[1].toLong()
    val m = 1000000007L

    var numerator = 1L
    for (i in 1..n) {
        numerator = (numerator * i) % m
    }

    var denominator = 1L
    for (i in 1..r) {
        denominator = (denominator * i) % m
    }
    for (i in 1..(n - r)) {
        denominator = (denominator * i) % m
    }

    val inverse = power(denominator, m - 2, m)

    println((numerator * inverse) % m)
}

fun power(base: Long, exponent: Long, mod: Long): Long {
    var p = base
    var q = exponent
    var ans = 1L
    while (q > 0) {
        if ((q and 1L) == 1L) {
            ans = (ans * p) % mod
        }
        p = (p * p) % mod
        q = q shr 1
    }
    return ans
}