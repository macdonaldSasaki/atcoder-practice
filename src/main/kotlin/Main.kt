import kotlin.math.max

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        var s = 0L
        val c = LongArray(n)
        for (i in 0 until n) {
            val f = readLine()!!.split(" ")
            val w = f[0].toLong()
            val p = f[1].toLong()
            s += p
            c[i] = w + p
        }
        c.sort()
        var a = 0
        var u = 0L
        for(x in c){
            if(x + u <= s){
                u += x
                a++
            }else{
                break
            }
        }
        println(a)
    }
}