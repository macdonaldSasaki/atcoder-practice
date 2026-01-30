import kotlin.math.max

fun main() {
  val i = readLine()!!.split(" ").map { it.toInt() }
    val n = i[0]
    val m = i[1]
    val s = Array(n){readLine()!!}
    val u = mutableSetOf<String>()

    for(r in 0 ..  n - m){
        for(c in 0 .. n - m){
            var t = ""
            for(k in 0 until m){
                t += s[r + k].substring(c , c + m) + "|"
            }
            u.add(t)

    }
}
    println(u.size)
}