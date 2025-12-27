import kotlin.math.max

fun main() {
    val n = 100
    // 1. 全部 True (素数) で初期化
    val isPrime = BooleanArray(n + 1) { true }

    // 2. 0と1は素数じゃない
    isPrime[0] = false
    isPrime[1] = false

    // 3. ふるいにかける（√N までやれば十分）
    // i * i <= n は「√Nまで」という意味
    var i = 2
    while (i * i <= n) {
        // もし i が素数として残っていたら...
        if (isPrime[i]) {
            // i の倍数 (2*i, 3*i, ...) を全部消す
            // j += i で倍数にジャンプしていく
            for (j in i * 2..n step i) {
                isPrime[j] = false
            }
        }
        i++
    }

    // 結果出力
    for (k in 0..n) {
        if (isPrime[k]) print("$k ")
    }
}