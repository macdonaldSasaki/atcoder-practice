import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ")
    val b = IntArray(n + 1)

    for(i in 0 until n ){
        b[i + 1] = s[i].toInt()
    }
    for(i in 1..n){
        var r = -1
        for(o in i - 1 downTo 1){
            if(b[i] > b[o]){
                r = o
                break
            }
        }
        println(r)
    }

}