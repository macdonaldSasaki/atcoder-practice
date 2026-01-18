import kotlin.math.max

fun main() {
    val a = readLine()!!.split(" ")
    val n = a[0].toInt()
    val m = a[1].toInt()

    val s = DoubleArray(m + 1)
    val c = IntArray(m + 1)

    repeat(n) {
        val b = readLine()!!.split(" ")
        val k = b[0].toInt()
        val v = b[1].toInt()
        s[k] += v.toDouble()
        c[k] += 1
    }

    for (i in 1..m) {
        println(s[i] / c[i])
    }
}