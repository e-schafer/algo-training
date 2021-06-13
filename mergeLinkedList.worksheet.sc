class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
def mergeKLists(lists: Array[ListNode]): ListNode = {
  def arrayToListNode(arr: Array[Int]): ListNode = {
    var dummyheader = new ListNode(0)
    var cursor = dummyheader
    for (x <- arr) {
      cursor.next = new ListNode(x)
      cursor = cursor.next
    }
    return dummyheader.next
  }

  def listNodeToArray(node: ListNode): Array[Int] = {
    if (node.next != null) Array(node.x) ++ listNodeToArray(node.next)
    else Array(node.x)
  }

  arrayToListNode(
    lists.filter(_ != null).map(x => listNodeToArray(x)).flatten.sorted
  )

}

val list1 = new ListNode(1, new ListNode(4, new ListNode(5)))
val list2 = new ListNode(1, new ListNode(3, new ListNode(4)))
val list3 = new ListNode(2, new ListNode(6))
val test1 = Array(list1, list2, list3)
val expected1 = new ListNode(
  1,
  new ListNode(
    1,
    new ListNode(
      2,
      new ListNode(
        3,
        new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))
      )
    )
  )
)

