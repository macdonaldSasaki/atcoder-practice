
fun main() {
    val n  = listOf(8,6,9,1,2,1,10,100,1000,10000)
    val a  = 10
    val queries = listOf(
        2 to 3,
        1 to 4,
        3 to 9,
        6 to 8,
        1 to 10
    )

    val s = IntArray(a + 1)
    for(i in 0 until a){
        s[i + 1]=s[i] + n[i]

    }
    for((l,r) in queries){
        println(s[r] - s[l - 1])
    }

}