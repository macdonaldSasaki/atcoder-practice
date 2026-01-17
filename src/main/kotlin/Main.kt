

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ")

    val s = IntArray(n)
    var t =  0

    for(i in 0 .. n - 1){
        val v = a[i].toInt()
        s[t] = v
        t ++

        if(t >= 4){
            val c = s[t - 1]
            if(s[t - 2] == c && s[t - 3] == c && s[t - 4] == c){
                t-=4
            }
        }
    }
    println(t)
}


