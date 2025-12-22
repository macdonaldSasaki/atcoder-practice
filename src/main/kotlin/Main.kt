
fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until n) {
        if (a[i] == k) {
            println("Yes")
            return
        }
    }

    println("No")
}
