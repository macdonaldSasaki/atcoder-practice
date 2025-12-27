import kotlin.math.max

fun main() {
    val (n, w) = readLine()!!.split(" ").map { it.toInt() }
    val (weight, value) = readLine()!!.split(" ").map { it.toLong() }
    val weightInt = weight.toInt()

    val dp = Array(n + 1){ LongArray(w + 1){0L} }

    dp[0][0] = 0
    for(i in 1..n){
        for(j in 0..w) {
            val patternA = dp[i - 1][j]
            if (j >= weight) {
                val patternB = dp[i - 1][j - weightInt] + value
                dp[i][j] = max(patternA, patternB)
            }else -1

        }
    }
    println(dp[n][w])
}


