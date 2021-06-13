def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
  val mergedArray = (nums1 ++ nums2).sorted
  println(s"**** ${mergedArray.mkString(",")}")

  val index = (mergedArray.size / 2).toInt
  if (mergedArray.size % 2 == 0) {
    (mergedArray(index - 1 ) + mergedArray(index)) / 2.0
  } else { mergedArray(index) }

}

val nums1 = Array(1, 3)
val nums2 = Array(2)
val result1 = 2

findMedianSortedArrays(nums1,nums2)
assert(findMedianSortedArrays(nums1, nums2) == result1)

val nums3 = Array(1, 2)
val nums4 = Array(3,4)
val result2 = 2.5
findMedianSortedArrays(nums3,nums4)

3%2