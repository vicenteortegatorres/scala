import org.scalatest.FlatSpec
import org.scalatest.Matchers

class CharacterShorterTest extends FlatSpec with Matchers {

  "CharacterShorter" must "return the input characters in order" in {

    CharacterShorter("When not studying nuclear physics, Bambi likes to play\nbeach volleyball.") shouldBe "aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy"
  }
}
