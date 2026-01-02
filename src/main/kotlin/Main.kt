

import kotlin.math.max

fun main() {
   val (n,k) = readLine()!!.split(" ").map { it.toLong() }
    if(k >= 2 * n - 2 && k % 2 == 0L){
        println("Yes")
    }else{
        println("No")
    }
}