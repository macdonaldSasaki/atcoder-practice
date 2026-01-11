

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = a.toMutableList()
    b.sort()
    val one = a.indexOf(b[0]) + 1
    val two = a.indexOf(b[1]) + 1
    val three = a.indexOf(b[2]) + 1

    println("$one $two $three")
}

