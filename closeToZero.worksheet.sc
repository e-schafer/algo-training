import scala.math.{abs, min}
val w = Array(-2, -1, -10, 1, 3, 20, 1)
val x = Array(-2, -10, 1, 3, 20, 1)
val y = Array(-2, -10, -50, 3, -1, 20)
val z: Array[Int] = Array()

def computeCloseToZero(ts: Array[Int]): Int = {
  //ts.reduce{(x,y) => min(x,y)}
  ts.distinct
    .sortWith(_.abs < _.abs)
    .slice(0, 2)
    .sortWith(_ > _)
    .headOption
    .getOrElse(0)
}

assert(computeCloseToZero(w) == 1)
assert(computeCloseToZero(x) == 1)
assert(computeCloseToZero(y) == -1)
assert(computeCloseToZero(z) == 0)
