import kotlin.math.max


fun main() {
    val a = readLine()!!.toInt()
    var voice = 0
    var count3 = 0
    repeat(a) {
        val x = readLine()!!.toInt()
        when (x) {
            1 -> voice++
            2 -> if (voice >= 1) voice--
            3 -> count3 = 1 - count3
        }

        if(voice >= 3 && count3 == 1){
            println("Yes")
        }else{
            println("No")
        }
    }
}

