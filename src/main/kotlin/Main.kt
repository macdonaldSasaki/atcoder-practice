

fun main() {
    val tStr = readLine()
    if (tStr == null) return
    val t = tStr.toInt()

    // 1. テストケースの数だけ repeat
    repeat(t) {
        val line2 = readLine()!!
        val split2 = line2.split(" ")
        val n = split2[0].toInt()
        val w = split2[1].toLong()
        val m = (2 * w).toInt()

        val line3 = readLine()!!
        val split3 = line3.split(" ")

        // いもす法用の配列（サイズは m+1 必要）
        val diff = LongArray(m + 1)

        for (i in 0 until n) {
            val cost = split3[i].toLong()
            val maskId = i + 1

            // 開始位置 l と 終了位置 r を計算
            val l = ((-maskId % m + m) % m).toInt()
            val r = ((l + w) % m).toInt()

            // 2. ここが「いもす法」の核心（repeatせず、+と-だけで済ます）
            if (l < r) {
                // またがない時
                diff[l] += cost
                diff[r] -= cost
            } else {
                // またぐ時（右端と左端に分ける）
                diff[l] += cost
                diff[m] -= cost // 右端まで
                diff[0] += cost // 左端から
                diff[r] -= cost
            }
        }

        // 3. 累積和（ここで一気に塗りつぶす）
        for (j in 0 until m) {
            diff[j+1] += diff[j]
        }

        var minVal = Long.MAX_VALUE
        for (j in 0 until m) {
            if (diff[j] < minVal) {
                minVal = diff[j]
            }
        }
        println(minVal)
    }
}