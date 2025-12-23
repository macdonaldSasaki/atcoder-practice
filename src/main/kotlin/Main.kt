
fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split("").map { it.toInt() }
    val s = IntArray(n + 1)
    for (i in 0 until n) {
        s[i + 1] = s[i] + a[i]
    }
    val q = readLine()!!.toInt()

    repeat(q) {
        val (l, r) = readLine()!!.split("").map { it.toInt() }
    }
    val wincount = s[r] - s[l - 1]
    val total = r - l + 1
    val losecount = total - wincount

    if (wincount > losecount) println("win")
    else if (wincount < losecount) println("lose")
    else println("draw")
}