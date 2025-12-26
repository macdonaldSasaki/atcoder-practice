import kotlin.math.min

fun main() {
   val n = readLine()!!.toInt()
   val a = readLine()!!.split(" ").map { it.toInt() }
   val b = readLine()!!.split(" ").map { it.toInt() }

    val alist = listOf(0,0) + a
    val blist = listOf(0,0,0) + b


    val dp = IntArray(n + 1)
    dp[1] = 0
    dp[2] = alist[2]

    for(i in 3 until n + 1){
        dp[i] = min(dp[i - 1] + alist[i] , dp[i - 2] + blist[i])
    }
    println(dp[n])
}


