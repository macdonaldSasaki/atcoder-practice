

fun main() {
    var n = 13
    var bin = ""
    while ( n > 0){
        bin = (n % 2).toString()+ bin
        n /= 2


    }
    println(bin.padStart(10,'0'))
}