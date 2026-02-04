import kotlin.math.abs

fun main() {
  val n = readLine()!!.toInt()
  var a = 0
  var b = 0
  var c = 0
  repeat(n){
    val (t, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val a1 = t - a
    val a2 = abs(x - b) + abs(y - c)
    val a3 = abs(a1 - a2)
    if(a1 < a2 || a3 % 2 != 0){
      println("No")
      return
    }
    a = t ; b = x ; c = y
  }
  println("Yes")
}
