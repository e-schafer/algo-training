import java.nio.file.Files


def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var currentCount = 0
    var max = 0

    for (x <- nums) {
        if (x == 0) currentCount= 0
        else {
            currentCount = currentCount + 1 
            max = Math.max(currentCount,max)
        }
    }
    max
}


val test1 = Array(1,1,0,1,1,1)
test1.zipWithIndex
val test2 = Array(1,0,1,1,0,1)

assert(findMaxConsecutiveOnes(test1) == 3)
assert(findMaxConsecutiveOnes(test2) == 2)