import scala.collection.immutable.HashMap

class AnagramGenerator {
  var dictionary = HashMap.empty[String, List[String]].withDefaultValue(List.empty)

  def addWordToDictionary(word: String): Unit = {
    val sortedWord = word.sorted
    val listAnagrams = dictionary(sortedWord)
    dictionary += sortedWord -> (word :: listAnagrams)
  }

  def anagrams(word: String): List[String] = dictionary(word.sorted)
}