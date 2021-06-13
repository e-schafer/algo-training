    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val numsSize=  nums.length

        for (i <- (0 until numsSize)) {
             for (j <-  0 until numsSize) {
                 if (i != j & (nums(i)+nums(j)==target)) return Array(i,j) 
            }
        }
        return Array(0,0)
    }



    val nums = Array(3,2,4)
    val target = 6
    val result = Array(1,2)

    assert(twoSum(nums,target)sameElements(result))