

fun main() {
    val input = readLine()!!.split(" ")
    val d = input[0].toInt()
    val f = input[1].toInt()

    val r = (d - f) % 7
    val a = 7 - r

    println(a)
    }

