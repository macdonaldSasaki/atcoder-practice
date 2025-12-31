

import kotlin.math.max

fun main() {
  val input = readLine()!!.split("")
   var x = input[0].toLong()
   var y =input[1].toLong()
    val m = 1000000007L
    var ans = 1L

    while (y>0){
        if((y and 1L) == 1L){
            ans = (ans * x) % m
        }
        x = (x*x) % m
        y = y shr 1
    }
    println(ans)
}