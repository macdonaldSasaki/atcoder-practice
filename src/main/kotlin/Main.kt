import kotlin.math.max

fun main() {
    val s1 = readLine()!!.split(" ")
    val n = s1[0].toLong()
    val m = s1[1].toInt()
    val b = n + 1
    val h = mutableSetOf<Long>()
    var a = 0

    repeat(m) {
        val s2 = readLine()!!.split(" ")
        val r = s2[0].toLong()
        val c = s2[1].toLong()

        var f = false
        for (x in -1.. 1){
            for(y in -1 .. 1){
                if(h.contains((r + x) * b + (c + y))){
                    f = true
                }
            }
        }
        if(!f){
            h.add(r * b + c)
            a++
        }
    }
    println(a)
}