import scala.collection.mutable

class Sorter[T](range: Vector[T]) {
  private val occurrences = mutable.HashMap.empty[T, Int].withDefaultValue(0)

  def sort(list: Vector[T]): Vector[T] = {
    list.foreach { element =>
      occurrences.update(element, occurrences(element) + 1)
    }

    for {
      element <- range
      elementRepetition <- Vector.fill(occurrences(element))(element)
    } yield {
      elementRepetition
    }
  }
}