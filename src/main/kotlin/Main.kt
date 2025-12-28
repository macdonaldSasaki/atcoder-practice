

import kotlin.math.max

fun main() {
  val n = readLine()!!.toInt()
    var current = 0

    repeat(n){
   val line = readLine()!!.split("")
    val t = line[0]
    val a = line[1].toInt()

      if(t == "+"){
        current += a
      }else if(t == "-"){
        current -= a
      }else if(t == "*"){
        current *= a
      }
      current %= 10000
      if(current < 0){
        current += 10000
      }
      println(current)
    }

}