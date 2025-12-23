
fun main() {
    val d = readLine()!!.toInt()
    val n  = readLine()!!.toInt()
    val xy = List(n){ readLine()!!.split("").map { it.toInt() }}

    val b = IntArray(d + 2)
    for ((l,r) in xy){
        b[l] += 1
        b[r + 1] -= 1
    }

    var current = 0
    for(i in 1..d){
        current += b[i]
        println(current)
    }



}