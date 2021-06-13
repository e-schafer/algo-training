def isUgly(n: Int): Boolean = {
    var currentVal: Int = n
    if (n < 1) return false
    while (currentVal > 1 ) {
        if (currentVal % 5 == 0) currentVal = currentVal / 5
        else if (currentVal % 3 == 0) currentVal = currentVal / 3
        else if (currentVal % 2 == 0) currentVal = currentVal / 2
        else return false
    }
    
    return true
}

isUgly(6)
isUgly(-2147483648)
