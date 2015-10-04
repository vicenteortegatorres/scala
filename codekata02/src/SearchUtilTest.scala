import org.scalatest.FlatSpec
import org.scalatest.Matchers

class SearchUtilTest extends FlatSpec with Matchers {

  "Functional binary search" must "return -1 when the input list is empty" in new SearchUtilBuilder {
    searchUtil.recursiveChop(1, Array()) shouldBe -1
  }

  it must "return 0 when the input list has just one element that is the searched element" in new SearchUtilBuilder {
    searchUtil.recursiveChop(3, Array(3)) shouldBe 0
  }

  it must "return 0 when the input list is (1,3,5) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.recursiveChop(1, Array(1, 3, 5)) shouldBe 0
  }

  it must "return 3 when the input list is (1, 3, 5, 7) and the element searched 7" in new SearchUtilBuilder {
    searchUtil.recursiveChop(7, Array(1, 3, 5, 7)) shouldBe 3
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 8" in new SearchUtilBuilder {
    searchUtil.recursiveChop(8, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return 2 when the input list is (1,3,5) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.recursiveChop(5, Array(1, 3, 5)) shouldBe 2
  }

  it must "return 0 when the input list is (1, 3, 5, 7) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.recursiveChop(1, Array(1, 3, 5, 7)) shouldBe 0
  }

  it must "return 1 when the input list is (1, 3, 5, 7) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.recursiveChop(3, Array(1, 3, 5, 7)) shouldBe 1
  }

  it must "return 2 when the input list is (1, 3, 5, 7) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.recursiveChop(5, Array(1, 3, 5, 7)) shouldBe 2
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.recursiveChop(0, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched -2" in new SearchUtilBuilder {
    searchUtil.recursiveChop(-2, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.recursiveChop(4, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.recursiveChop(6, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (3) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.recursiveChop(6, Array(3)) shouldBe -1
  }

  it must "return 1 when the input list is (1,3,5) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.recursiveChop(3, Array(1, 3, 5)) shouldBe 1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.recursiveChop(0, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 2" in new SearchUtilBuilder {
    searchUtil.recursiveChop(2, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.recursiveChop(4, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.recursiveChop(6, Array(1, 3, 5)) shouldBe -1
  }

  "Imperative binary seach" must "return -1 when the input list is empty" in new SearchUtilBuilder {
    searchUtil.imperativeChop(1, Array()) shouldBe -1
  }

  it must "return 0 when the input list has just one element that is the searched element" in new SearchUtilBuilder {
    searchUtil.imperativeChop(3, Array(3)) shouldBe 0
  }

  it must "return 0 when the input list is (1,3,5) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.imperativeChop(1, Array(1, 3, 5)) shouldBe 0
  }

  it must "return 3 when the input list is (1, 3, 5, 7) and the element searched 7" in new SearchUtilBuilder {
    searchUtil.imperativeChop(7, Array(1, 3, 5, 7)) shouldBe 3
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 8" in new SearchUtilBuilder {
    searchUtil.imperativeChop(8, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return 2 when the input list is (1,3,5) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.imperativeChop(5, Array(1, 3, 5)) shouldBe 2
  }

  it must "return 0 when the input list is (1, 3, 5, 7) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.imperativeChop(1, Array(1, 3, 5, 7)) shouldBe 0
  }

  it must "return 1 when the input list is (1, 3, 5, 7) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.imperativeChop(3, Array(1, 3, 5, 7)) shouldBe 1
  }

  it must "return 2 when the input list is (1, 3, 5, 7) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.imperativeChop(5, Array(1, 3, 5, 7)) shouldBe 2
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.imperativeChop(0, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched -2" in new SearchUtilBuilder {
    searchUtil.imperativeChop(-2, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.imperativeChop(4, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.imperativeChop(6, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (3) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.imperativeChop(6, Array(3)) shouldBe -1
  }

  it must "return 1 when the input list is (1,3,5) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.imperativeChop(3, Array(1, 3, 5)) shouldBe 1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.imperativeChop(0, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 2" in new SearchUtilBuilder {
    searchUtil.imperativeChop(2, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.imperativeChop(4, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.imperativeChop(6, Array(1, 3, 5)) shouldBe -1
  }

  "Slices binary seach" must "return -1 when the input list is empty" in new SearchUtilBuilder {
    searchUtil.slicesChop(1, Array()) shouldBe -1
  }

  it must "return 0 when the input list has just one element that is the searched element" in new SearchUtilBuilder {
    searchUtil.slicesChop(3, Array(3)) shouldBe 0
  }

  it must "return 0 when the input list is (1,3,5) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.slicesChop(1, Array(1, 3, 5)) shouldBe 0
  }

  it must "return 3 when the input list is (1, 3, 5, 7) and the element searched 7" in new SearchUtilBuilder {
    searchUtil.slicesChop(7, Array(1, 3, 5, 7)) shouldBe 3
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 8" in new SearchUtilBuilder {
    searchUtil.slicesChop(8, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return 2 when the input list is (1,3,5) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.slicesChop(5, Array(1, 3, 5)) shouldBe 2
  }

  it must "return 0 when the input list is (1, 3, 5, 7) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.slicesChop(1, Array(1, 3, 5, 7)) shouldBe 0
  }

  it must "return 1 when the input list is (1, 3, 5, 7) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.slicesChop(3, Array(1, 3, 5, 7)) shouldBe 1
  }

  it must "return 2 when the input list is (1, 3, 5, 7) and the element searched 5" in new SearchUtilBuilder {
    searchUtil.slicesChop(5, Array(1, 3, 5, 7)) shouldBe 2
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.slicesChop(0, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched -2" in new SearchUtilBuilder {
    searchUtil.slicesChop(-2, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.slicesChop(4, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (1, 3, 5, 7) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.slicesChop(6, Array(1, 3, 5, 7)) shouldBe -1
  }

  it must "return -1 when the input list is (3) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.slicesChop(6, Array(3)) shouldBe -1
  }

  it must "return 1 when the input list is (1,3,5) and the element searched 3" in new SearchUtilBuilder {
    searchUtil.slicesChop(3, Array(1, 3, 5)) shouldBe 1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 0" in new SearchUtilBuilder {
    searchUtil.slicesChop(0, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 2" in new SearchUtilBuilder {
    searchUtil.slicesChop(2, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 4" in new SearchUtilBuilder {
    searchUtil.imperativeChop(4, Array(1, 3, 5)) shouldBe -1
  }

  it must "return -1 when the input list is (1,3,5) and the element searched 6" in new SearchUtilBuilder {
    searchUtil.slicesChop(6, Array(1, 3, 5)) shouldBe -1
  }

  it must "return 0 when the input list is (1, 3, 5, 7, 9 , 11) and the element searched 1" in new SearchUtilBuilder {
    searchUtil.slicesChop(1, Array(1, 3, 5, 7, 9, 11)) shouldBe 0
  }

  it must "return -1 when the input list is (1, 3, 5, 7, 9 , 11) and the element searched -3" in new SearchUtilBuilder {
    searchUtil.slicesChop(-3, Array(1, 3, 5, 7, 9, 11)) shouldBe -1
  }

  trait SearchUtilBuilder {
    var searchUtil = new SearchUtil()
  }

}