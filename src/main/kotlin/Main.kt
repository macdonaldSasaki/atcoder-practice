import kotlin.math.max

fun main(){
    val s = readLine()!!.split(" ")
    val n = s[0].toInt()
    val m = s[1].toInt()
    val d = IntArray(n + 1)

    repeat(m){
        val t = readLine()!!.split(" ")
        val u = t[0].toInt()
        val v = t[1].toInt()
        d[u]++
        d[v]++
    }

    val r = LongArray(n)
    for(i in 1..n){
        val k = (n - 1 - d[i] ).toLong()
        if(k < 3){
            r[i - 1] = 0
        }else{
            r[i - 1] = k * (k - 1) * (k - 2) / 6
        }
    }

println(r.joinToString (" "))
}
