
fun main() {
    val t = readLine()!!.toInt()
    val  n = readLine()!!.toInt()
    val xy = List(n){ readLine()!!.split(" ").map { it.toInt() }}

    val b = IntArray(t + 1)
    for ((l,r) in xy ){
        b[l] += 1
        b[r] -= 1
    }

    var now = 0
    for (i in 0 until t){
        now = b[i] + now
        println(now)
    }

}