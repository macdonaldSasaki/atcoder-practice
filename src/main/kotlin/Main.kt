import kotlin.math.max

fun main() {
    val n = readLine()!!
    val l = n.map { it.toString().toInt() }.sorted().toMutableList()
    var c = 0
    for (i in 0 until l.size) {
        if (l[i] == 0) {
            c++ // 0のときはカウントを増やす
            continue
        } else {
            // ここで c++ してはダメ。今の c が「0以外の最初の位置」を指している
            break
        }
    }
    val z = l[0]
    l[0] = l[c]
    l[c] = z
    println(l.joinToString(""))
}