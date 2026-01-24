import kotlin.math.max


fun main() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val d = IntArray(x + 1)

    repeat(y) {
        val (u, v) = readLine()!!.split(" ").map { it.toInt() }
        d[u]++
        d[v]++
    }
    val r = LongArray(x)
    for (i in 1..x) {
        val k = (x - 1 - d[i]).toLong()
        if (k < 3) {
            r[i - 1] = 0
        } else {
            val v = (0..2).fold(1L) { a, b -> a * (k - b) }
            r[i - 1] = v / 6
        }
    }
    println(r.joinToString(" "))
}


