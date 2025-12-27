import kotlin.math.max


    fun isprime(x : Int) : Boolean {
        if (x < 2) return false
        var i = 2
        while (i * i <= x) {
            if (x % i == 0) {
                return false
            }
            i++
        }
        return true
    }
        fun main() {
            val q = readLine()!!.toInt()
            repeat(q) {
                val x = readLine()!!.toInt()
                if (isprime(x)) {
                    println("Yes")
                } else {
                    println("No")
                }
            }


        }


