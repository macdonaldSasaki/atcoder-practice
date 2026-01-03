

fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }

    val map = mutableMapOf<Long, Long>()
    var count = 0L

    for (x in a) {
        // 過去の自分たちの中に相方が何人いるか確認
        count += map.getOrDefault(k - x, 0L)

        // 自分自身をMapに登録（または個数を+1）
        map[x] = map.getOrDefault(x, 0L) + 1L
    }
    println(count)
}