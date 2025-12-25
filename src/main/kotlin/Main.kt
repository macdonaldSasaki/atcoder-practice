
fun main() {
   val (n,k) = readLine()!!.split(" ").map { it.toInt() }
   val a = readLine()!!.split(" ").map { it.toInt() }

   var r = 0
   var ans = 0L

   for(l in 0 until n){
       while (r < n - 1 && a[r + 1] - a[l] <= k){
           r++
       }
       ans += r - l
   }
    println(ans)
}

