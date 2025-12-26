import kotlin.math.min

fun main() {
    val (n, s) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    val dp = Array(n + 1) { BooleanArray(s + 1) }
    dp[0][0] = true

    for (i in 1..n) {
        val card = a[i - 1]
        for (j in 0..s) {
            val patternA = dp[i - 1][j]
            val patternB = if(j >= card) dp[i -1][j - card] else false

            if(patternA || patternB){
                dp[i][j] = true
            }

        }


    }
}


