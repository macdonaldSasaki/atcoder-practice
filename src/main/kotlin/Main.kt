import kotlin.math.abs

fun main() {
  val (h, w) = readLine()!!.split(" ").map { it.toInt() }
  val s = Array(h) { readLine()!! }

  val dy = intArrayOf(-1,1,0,0)
  val dx = intArrayOf(0,0,-1,1)

  for(i in 0 until h){
    for(j in 0 until w){

      if(s[i][j] == '#'){
        var ok = false
         for(k in 0 until 4){
           val ni = i + dy[k]
           val nj = j + dx[k]

           if(ni >= 0 && ni < h && nj >= 0 && nj < w){
             if(s[ni][nj] == '#'){
               ok = true
             }
           }
         }
        if(!ok){
          println("No")
          return
        }
      }

    }
  }
  println("Yes")
}
