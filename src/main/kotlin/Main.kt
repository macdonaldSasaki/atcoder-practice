

fun main() {
val n = readLine()!!.split(" ").map { it.toInt() }
    val x = readLine()!!.split(" ").map { it.toInt() }
    var y = n[0]
    val z = mutableListOf<Int>()
    for(i in x) {
        if (!z.contains(i)) {
            y -= 1
            z.add(i)
        }else{
            y += 1
            z.remove(i)
        }
    }
    println(y)
}

