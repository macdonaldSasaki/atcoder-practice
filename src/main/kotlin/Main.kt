

fun main(){
    var n = readLine()!!.toInt()
    val coins = intArrayOf(500, 100, 50, 10, 5, 1)
    var count = 0

    for(i in coins){
        count += n / i
        n %= i
    }
    println(count)
}