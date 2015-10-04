import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.BeforeAndAfter
import scala.io.Source

class AnagramGeneratorTest extends FlatSpec with Matchers {

  "AnagramGenerator" must "generates all the permutations for enlist" in new AnagramGeneratorCreator {

    anagramGenerator.anagrams("enlist") shouldBe List("tinsel", "silent", "listen", "inlets", "enlist")
  }

  it must "generates all the permutations for kinship" in new AnagramGeneratorCreator {

    anagramGenerator.anagrams("kinship") shouldBe List("pinkish", "kinship")
  }

  it must "generates all the permutations for paste" in new AnagramGeneratorCreator {

    anagramGenerator.anagrams("paste") shouldBe List("tapes", "spate", "septa", "pates", "paste")
  }

  trait AnagramGeneratorCreator {
    val anagramGenerator = new AnagramGenerator
    loadDictionary(anagramGenerator)
  }

  private def loadDictionary(anagramGenerator: AnagramGenerator) {
    val data = Source.fromFile("words")
    for (line <- data.getLines()) {
      anagramGenerator.addWordToDictionary(line)
    }
  }
}