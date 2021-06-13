val w = 7
val x = 10
val y = 100
val z = 1000
val zz = 10000

def computeSum1(limit: Int) =
  1.to(limit).filter { x: Int => x % 3 == 0 || x % 5 == 0 || x % 7 == 0 }.sum

def computeSum2(limit: Int) = {
  def gaussSum(subLimit: Int) = subLimit * (subLimit + 1) / 2
  3 * gaussSum(limit / 3) + 5 * gaussSum(limit / 5) + 7 * gaussSum(
    limit / 7
  ) - 15 * gaussSum(limit / 15) - 21 * gaussSum(limit / 21) - 35 * gaussSum(
    limit / 35
  ) + 105 * gaussSum(limit / 105)
}

def time[R](block: => R): Long = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    t1 - t0 
}

assert(computeSum1(w) == 21)
assert(computeSum1(x) == 40)
assert(computeSum1(y) == 2838)
assert(computeSum1(z) == 272066)
assert(computeSum1(zz) == 27152139)

computeSum2(w)
assert(computeSum2(w) == 21)
computeSum2(x)
assert(computeSum2(x) == 40)
computeSum2(y)
assert(computeSum2(y) == 2838)
computeSum2(z)
assert(computeSum2(z) == 272066)
computeSum2(zz)
assert(computeSum2(zz) == 27152139)

assert(computeSum1(100000) == computeSum2(100000))

val time1 = time{computeSum1(1000)}
val time11 = time{computeSum1(10000)}
val time111 = time{computeSum1(100000)}
val time1111 = time{computeSum1(100000000)}

val time2 = time{computeSum2(1000)}
val time22 = time{computeSum2(10000)}
val time222 = time{computeSum2(100000)}
val time2222 = time{computeSum2(100000000)}
