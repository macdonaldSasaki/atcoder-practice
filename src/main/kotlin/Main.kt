
fun main() {
    val n  = listOf(0,1,1,0,1,0,0)
    val a = 7
    val queries = listOf(
        2 to 5,
        2 to 7,
        5 to 7,
    )
    val s = IntArray(a + 1)
    for(i in 0 until a){
        if(n[i] == 1){
            s[i + 1] = s[i] + 1
        }else{
            s[i + 1] = s[i]
        }
    }
    for((l,r) in queries){
        val count2 = s[r] - s[l - 1]
        val total = r - l + 1
        val count0 = total - count2

        if(count2 > total) println("win")
        else if(count2 < total) println("lose")
        else println("draw")
    }

}