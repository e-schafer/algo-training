import scala.collection.mutable.ArrayBuffer

def tasseArray(str: Array[String]) = {

  val w = str.filter(x => !x.equals("."))
  w ++ List.fill(str.length - w.length)(".") 

}

val test1 = "a,b,.,c,.,.,k".split(",")
val expected1 = "a,b,c,k,.,.,.".split(",")
tasseArray(test1)
assert(tasseArray(test1).sameElements(expected1))
