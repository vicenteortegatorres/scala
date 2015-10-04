class Rack {
  var numbers = Vector.empty[Int]

  def add(n: Int): Unit = {
    numbers = numbers :+ n
  }

  def balls: List[Int] = {
    val sorter = new Sorter((0 to 59).toVector)
    sorter.sort(numbers).toList
  }
}