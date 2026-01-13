

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (N, W) = readLine()!!.split(" ").map { it.toInt() }
        val C = readLine()!!.split(" ").map { it.toLong() }

        // N <= W のときは黒を0にできる
        if (N <= W) {
            println(0)
            return@repeat
        }

        // 配列を2倍にして円環を直線化
        val A = LongArray(2 * N)
        for (i in 0 until N) {
            A[i] = C[i]
            A[i + N] = C[i]
        }

        // 累積和
        val pref = LongArray(2 * N + 1)
        for (i in 0 until 2 * N) {
            pref[i + 1] = pref[i] + A[i]
        }

        // 長さWの連続区間（黒ブロック）を全探索
        var ans = Long.MAX_VALUE
        for (l in 0 until N) {
            val r = l + W
            val cost = pref[r] - pref[l]
            if (cost < ans) ans = cost
        }

        println(ans)
    }
}
