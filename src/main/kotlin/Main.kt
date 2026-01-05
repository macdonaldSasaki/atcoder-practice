

fun main() {
val n = readLine()!!
    val x = n.filter (Char :: isDigit ).toInt()
    if(x >= 1 && x <= 349 && x != 316){
        println("Yes")
    }else{
        println("No")
    }

}

