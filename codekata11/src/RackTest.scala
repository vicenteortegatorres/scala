import org.scalatest.FlatSpec
import org.scalatest.Matchers

class RackTest extends FlatSpec with Matchers {

  "Rack balls" must "be an empty list when there were no balls added" in new RackCreator {

    rack.balls shouldBe List.empty
  }

  it must "be {20} when 20 was added" in new RackCreator {
    rack.add(20)

    rack.balls shouldBe List(20)
  }

  it must "be {10, 20} when 20 and 10 were added" in new RackCreator {
    rack.add(20)
    rack.add(10)

    rack.balls shouldBe List(10, 20)
  }

  it must "be {10, 20, 30} when 20, 10 and 30 were added" in new RackCreator {
    rack.add(20)
    rack.add(10)
    rack.add(30)

    rack.balls shouldBe List(10, 20, 30)
  }

  trait RackCreator {
    val rack = new Rack
  }

}