

fun main() {
val n = readLine()!!.toInt()
    var x : Long = 0
    var y : Long = 0
    val c = IntArray(n + 1)
    for(i in 1 .. n){
        val x1 = i.toLong()
        x = x1 * x1
        if(x > n) break
        for(l in i + 1 .. n){
            val y1 = l.toLong()
            y = y1 * y1
            val z = x + y
            if(z > n) break
               c[z.toInt()]++


            }
        }
    val a = ArrayList<Int>()
    for (i in 1..n) {
        if (c[i] == 1) a.add(i)
    }
    println(a.size)
    println(a.joinToString(" "))
    }

