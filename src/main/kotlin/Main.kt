
fun main() {
    val goods = listOf<Int>(300, 300, 400, 900)
    val sum = 1000
    var found = false

    for (i in 0 until goods.size) {
        for (j in i + 1 until goods.size) {
            for (k in j + 1 until goods.size) {
                if (goods[i] + goods[j] + goods[k] == sum) {
                    found = true
                }
            }
        }
    }
    if (found) println("yes") else println("no")
}

class GoodsChecker(private val goods: List<Int>) {
    fun canMakeSum(target: Int): Boolean {
        for (i in 0 until goods.size) {
            for (j in i + 1 until goods.size) {
                for (k in j + 1 until goods.size) {
                    if (goods[i] + goods[j] + goods[k] == target) {
                        return true
                    }
                }
            }
        }
        return false
    }
}
