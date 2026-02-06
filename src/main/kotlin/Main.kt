import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min

fun main() {
val (n,q) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    val t = IntArray(n + 1)

    for(i in 1 until n){
        if(s[i] == 'C' && s[i - 1] == 'A'){
            t[i + 1] = t[i] + 1
        }else{
            t[i + 1] = t[i]
        }
    }
    repeat(q){
        val(l,r) = readLine()!!.split(" ").map { it.toInt() }
        println(t[r] - t[l])
    }

}
