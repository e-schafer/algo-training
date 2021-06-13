
def longestCommonPrefix(strs: Array[String]): String = {
    if(strs == null || strs.isEmpty || strs.contains("")) return ""
    val newList = strs.filter(_.nonEmpty).sortBy(_.length())
    val maxSizePrefix = newList.head.length()
    println(s"** maxSize $maxSizePrefix")
    for (x <- maxSizePrefix to 0 by -1){
        println(s"** $x")
        val prefix = newList.head.slice(0,x)
        println(s"**prefix $prefix")

        if(newList.tail.forall(_.startsWith(prefix))) return prefix
    }
    return ""
}


val test1 = Array("flower","flow","flight")
val expected1 = "fl"
longestCommonPrefix(test1)
assert(longestCommonPrefix(test1) == expected1)