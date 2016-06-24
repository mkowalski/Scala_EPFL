package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s = union(s1, s2)
  println(contains(filter(s,_ < 2),1))
  println(contains(filter(s,_ < 2),2))
  printSet(s)
  printSet(filter(s,_ < 2))
  printSet(map(s, _ + 2))
}
