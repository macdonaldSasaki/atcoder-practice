
fun main() {
    val n = listOf<Int>(1, 2, 3)
    val k = 6
    var count = 0

    for (x in n) {
        for (y in n) {
            val z = k - x - y
            if (k == x + y + z && n.contains(z)) {
                count++

            }
        }
    }
}
