import scala.annotation.tailrec

class SearchUtil {
  def recursiveChop(n: Int, list: Array[Int]): Int = {

    @tailrec
    def innerRecursiveChop(start: Int, end: Int): Int = {
      if (start > end) {
        -1
      } else {
        val c = center(start, end)
        val valuerInCenter = list(c)
        if (valuerInCenter == n) c
        else if (n > valuerInCenter) innerRecursiveChop(c + 1, end)
        else innerRecursiveChop(start, c - 1)
      }
    }

    innerRecursiveChop(0, list.length - 1)
  }

  def imperativeChop(n: Int, list: Array[Int]): Int = {
    var start = 0
    var end = list.length - 1
    var c = 0
    var valuerInCenter = 0
    while (start <= end) {
      c = center(start, end)
      valuerInCenter = list(c)
      if (valuerInCenter == n) return c
      else if (n > valuerInCenter) start = c + 1
      else end = c - 1
    }
    -1
  }

  def slicesChop(n: Int, list: Array[Int]): Int = {

    @tailrec
    def innerSlicesChop(list: Array[Int], firstElementIndex: Int): Int = {
      val listLength = list.length
      if (listLength == 0) {
        -1
      } else {
        val center = (listLength - 1) / 2
        val realCenter = firstElementIndex + center
        val valuerInCenter = list(center)
        if (valuerInCenter == n) realCenter
        else if (n > valuerInCenter) innerSlicesChop(list.slice(center + 1, listLength), realCenter + 1)
        else innerSlicesChop(list.slice(0, center), 0)
      }
    }

    innerSlicesChop(list, 0)
  }

  private def center(start: Int, end: Int): Int = (start + end) / 2
}
