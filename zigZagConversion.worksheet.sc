def convert(s: String, numRows: Int): String = {
    if (s.length <= numRows) return s
    
    var mylist = List.fill(numRows)(new StringBuilder())
    var direction = -1
    var currentRow = 0
    for (current <- 0 until s.length()) {
        println(s"******currentRow $currentRow direction $direction")
        mylist(currentRow).append(s(current))
        if( currentRow == numRows-1 || currentRow == 0) direction = direction * -1              
        currentRow += direction
    }
    mylist.mkString
}

val s = "PAYPALISHIRING"
val numRows = 3
val result = "PAHNAPLSIIGYIR"

convert(s,numRows)
assert(convert(s,numRows)==result)


