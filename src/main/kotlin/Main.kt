import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()
    val grid = Array(n) { IntArray(n) { -1 } }
    grid[0][(n - 1) / 2] = 1
    var r = 0
    var c =(n - 1) / 2
    var k = 1
    val z = n * n - 1

    repeat(z){
        k ++
        var x = r
        var y = c
        r = (r - 1 + n) % n
        c = (c + 1) % n
        if(grid[r][c] == -1){
            grid[r][c] = k
        }else{
            r = (x + 1) % n
            grid[r][y] = k
            c = y
        }
    }
    for(i in 0 until n){
        println(grid[i].joinToString(" "))
    }
}
