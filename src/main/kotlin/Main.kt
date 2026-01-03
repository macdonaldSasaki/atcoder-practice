import kotlin.math.*

fun main() {
    val n = readLine()!!.toInt()
    val movie = MutableList(n) {
        val line = readLine()!!.split(" ").map { it.toInt() }
        line[0] to line[1]
    }
    movie.sortBy { it.second }

    var count = 0
    var finish = 0

    for(x in movie){
        val start = x.first
        val end = x.second

        if(start >= finish){
            finish = end
            count++

        }
    }
println(count)


}

