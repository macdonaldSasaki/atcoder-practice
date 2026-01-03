import kotlin.math.*

fun main() {
 val n = readLine()!!.toInt()
    val x = DoubleArray(n)
    val y = DoubleArray(n)

    for(i in 0 until n){
        val line = readLine()!!.split("")
        x[i] = line[0].toDouble()
        y[i] = line[1].toDouble()

        val visited = BooleanArray(n)
        var now = 0
        visited[0] = true
        println(1)

        repeat(n - 1){
            var next = -1
            var min = Double.MAX_VALUE

            for(i in 0 until n){
                if(!visited[i]){
                    val d = sqrt((x[now] - x[i]).pow(2) + (y[now] + y[i]).pow(2))
                if(d < min){
                    min = d
                    next = i
                }
                }
            }
            visited[next] = true
            println(next + 1)
            now = next
        }
    }
    println(1)
}