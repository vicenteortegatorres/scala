package bowling

class Game {
  private var scores = Array.fill[Int](21)(0)
  private var currentScore : Int = 0
  
  def roll(pins: Int) {
    scores.update(currentScore, pins)
    currentScore+=1
  }
  
  def score() = {
    var score = 0
    var frameFirstElementIndex = 0
    for(frame <- (1 to 10)){
      if(isStrike(frameFirstElementIndex)){
        score += 10 + nextTwoScoresForStrike(frameFirstElementIndex)   
        frameFirstElementIndex += 1     
      } else {
        if(isSpare(frameFirstElementIndex)){
          score += 10 + nextScoresForSpare(frameFirstElementIndex)  
        } else {
          score += frameScore(frameFirstElementIndex)
        }
        frameFirstElementIndex += 2
      }
    }
    score
  }
  
  private def isSpare(frameFirstElementIndex: Int) = scores(frameFirstElementIndex) + scores(frameFirstElementIndex + 1) == 10
  
  private def isStrike(frameFirstElementIndex: Int) = scores(frameFirstElementIndex) == 10
  
  private def evenNumber(n: Int) = n % 2 == 0
  
  private def nextTwoScoresForStrike(frameFirstElementIndex: Int) = scores(frameFirstElementIndex + 1) + scores(frameFirstElementIndex + 2)   

  private def nextScoresForSpare(frameFirstElementIndex: Int) = scores(frameFirstElementIndex + 2)

  private def frameScore(frameFirstElementIndex: Int) = scores(frameFirstElementIndex) + scores(frameFirstElementIndex + 1)   

}