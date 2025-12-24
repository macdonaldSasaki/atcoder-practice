
fun main() {
    val (n,x)  = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var l = 0
    var r = n - 1
     while (l <= r) {
         var m = (l + r) / 2
         if (x < a[m]) {
             r = m - 1
         } else if(x > a[m]){
             l = m + 1
             }else {
                 println(m + 1)
             return
             }
     }
}

