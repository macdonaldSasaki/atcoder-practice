import kotlin.math.max

fun main() {
    var i = readLine()!!.split(" ")
    var n = i[0].toInt()
    var t = i[1].toLong()
    var w = 0L
    var o = 0L
    var s = true
    if (n > 0) {
        var a = readLine()!!.split(" ").map { it.toLong() }
        for (p in a) {
            if (p >= o) {
                s = true
            } else {
                s = false
            }
            if (s == true) {
                w += (p - o)
                o = p + 100
                s = false
            }
        }
    }
    if (o < t) {
        w = w + (t - o)
    }
    println(w)
}