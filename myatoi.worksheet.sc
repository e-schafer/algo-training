def myAtoi(s: String): Int = {

    val newString = s.trim()

    def accumulateDigit(str: String, sign:Int): Int = {
      var number = BigInt(0)
      var index = 0
      while (index < str.length && str(index).isDigit) {
        number = number * 10 + (str(index).toInt - 48)
        index += 1
      }
      number = number * sign
      if (number >= Int.MaxValue) Int.MaxValue
      else if (number <= Int.MinValue) Int.MinValue
      else number.toInt
    }

    if (newString.isEmpty()) return 0
    else if (!newString.head.isDigit && newString.length() == 1) return 0
    else if (newString.head.isDigit) {
      return accumulateDigit(newString,1)
    } else if (newString.head == '-' && newString(1).isDigit) {
      val x = accumulateDigit(newString.tail,-1)
      return x
    } else if (newString.head == '+' && newString(1).isDigit) {
      val x = accumulateDigit(newString.tail,1)
      return x
    } else 0
    
}

val test1 = "42"
val expected1 = 42
assert(myAtoi(test1) == expected1)

val test2 = "-91283472332"
val expected2 = -2147483648
myAtoi(test2)
assert(myAtoi(test2) == expected2)

val test3 = "   -42"
val expected3 = -42
myAtoi(test3)
assert(myAtoi(test3) == expected3)

val test4 = "3.14159"
val expected4 = 3
myAtoi(test4)
assert(myAtoi(test4) == expected4)

val test5 = "+-12"
val expected5 = 0
myAtoi(test5)
assert(myAtoi(test5) == expected5)

BigInt("21474836460") > Int.MaxValue


val test6 = "21474836460"
val expected6 = 2147483647
myAtoi(test6)
assert(myAtoi(test6) == expected6)