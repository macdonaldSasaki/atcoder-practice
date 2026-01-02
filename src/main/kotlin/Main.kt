

import kotlin.math.max

fun main() {
 val q = readLine()!!.toInt()
    val score = mutableMapOf<String,Int>()

    repeat(q){
        val input = readLine()!!.split(" ")
        val type = input[0].toInt()

        if(type == 1){
            val x = input[1]
            val y = input[2].toInt()
            score[x] = y
        }else{
            val x = input[1]
            println(score[x])
        }
    }
}