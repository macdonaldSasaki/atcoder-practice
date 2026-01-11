

fun main() {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val x = n *(1 shl k)
    println(x)
}

git add . git commit -m "A"  git push