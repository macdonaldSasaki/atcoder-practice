import kotlin.math.max

fun main() {
    val h = readLine()!!.split(" ").map { it.toInt() }
    val d = h[0]
    val t = h[2]

    val a = List(d) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    val c = IntArray(d)

    repeat(t) {
        val x = readLine()!!.toInt()

        for (i in 0 until d) {
            if (a[i].contains(x)) {
                c[i]++
            }
        }
    }
        println(c.maxOrNull() ?: 0)

}
