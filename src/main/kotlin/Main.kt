

import kotlin.math.max

fun main() {
   var (n,m) = readLine()!!.split(" ").map { it.toLong() }
    while(n >= 1 && m >= 1){
        if(n >= m){
             n = n % m
        }else{
            m = m % n
        }

    }
    if(n != 0L)println(n) else println(m)
}