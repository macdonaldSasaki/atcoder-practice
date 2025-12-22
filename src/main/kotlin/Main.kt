
fun main() {
    val (n, m, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until n) {          // A のインデックスを回す
        for (j in 0 until m) {      // B のインデックスを回す
            if (a[i] + b[j] == k) { // A[i] と B[j] の和が K か？
                println("Yes")
                return
            }
        }
    }

    println("No")
}
