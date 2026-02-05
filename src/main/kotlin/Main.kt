import kotlin.math.abs
import kotlin.math.*

fun main() {
val n = readLine()!!.toLong()
    var min = 11
    var i = 1L
    while(i * i <= n){
        if(n % i == 0L){
            val a = i
            val b = n / i
            val a1 = a.toString().length
            val b1 = b.toString().length

            val f = max(a1,b1)
            min = min(min,f)
        }
        i++
    }
    println(min)

}
