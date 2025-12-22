
fun main() {
    val n = "00001101"

    var ans = 0
    for(c in n){
        val x = c.digitToInt()
        ans = ans*2 + x
    }
    println(ans)

}