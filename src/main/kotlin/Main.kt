import kotlin.math.abs
import kotlin.math.*

fun main() {
    val s = readLine()!!
    val a = s[0] - '0'
    val b = s[1] - '0'
    val c = s[2] - '0'
    val d = s[3] - '0'

    for(i in 0 until (1 shl 3)){
        var sum = a
        var ans = "$a"

        if((i shr 0) and 1 == 1){
            sum += b
            ans += "+$b"
        }else{
            sum -= b
            ans += "-$b"
        }
        if ((i shr 1) and 1 == 1) {
            sum += c
            ans += "+$c"
        } else {
            sum -= c
            ans += "-$c"
        }
        if ((i shr 2) and 1 == 1) {
            sum += d
            ans += "+$d"
        } else {
            sum -= d
            ans += "-$d"
        }
        if(sum == 7){
            println("$ans=7")
            return
        }
    }
}
