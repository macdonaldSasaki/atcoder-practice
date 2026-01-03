

fun main() {
    var n = readLine()!!.toInt()
    val s = mutableSetOf<Int>()

    while (n != 1 && !s.contains(n)) {
        s.add(n)

        var t = 0
        n.toString().forEach { c ->
            val d = c.toString().toInt()
            t += d * d
        }
        n = t
    }
    if(n == 1) println("Yes") else println("No")
}

