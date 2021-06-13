def countPrimes(n: Int): Int = {

    def isPrime(num : Int) : Boolean = {
        val limit = math.sqrt(num).toInt
        for (i <- 2 to limit) {
            if (num % i == 0) return false
        }
        return true
    }
    if (n < 3) 0
    else  0.until(n).count(isPrime)
}

countPrimes(10)
countPrimes(0)
countPrimes(3)