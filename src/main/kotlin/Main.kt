import kotlin.math.max

fun main() {
    val s1 = readLine()!!.toInt()
    repeat(s1) {
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

        val k = LongArray(n + 1)
        for(i in 0 until n) k[i + 1] = k[i] + c[i]
        var l = 0
        var r = n
        var a = 0
        while(l <= r){
            val m = (l + r) / 2
            if(k[m] <= s){
                a = m
                l = m + 1
            }else{
                r = m - 1
            }
        }
        println(a)
    }
}