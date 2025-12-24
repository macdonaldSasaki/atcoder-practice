
fun main() {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }

    var l = 1L
    var r = 1_000_000_000L
    var ans = r

    while (l <= r) {
        val mid = (l + r) / 2
        var total = 0L
        for(i in a){
            total += mid / i
            if(total >= k) break
        }
        if(total >= k){
            ans = mid
            r = mid - 1
        }else{
           l = mid + 1
        }


    }
    println(ans)
}

