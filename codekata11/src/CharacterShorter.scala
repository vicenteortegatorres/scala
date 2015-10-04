object CharacterShorter {
  def apply(sentence: String): String = {
    val sorter = new Sorter(('a' to 'z').toVector)
    sorter.sort(sentence.toLowerCase.toCharArray.toVector).mkString
  }
}
