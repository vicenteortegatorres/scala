package bowling

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.BeforeAndAfter

class BowlingTest extends FlatSpec with Matchers with BeforeAndAfter {
  
  var game : Game = _
  
  before {
    game = new Game
  }
  
  "The game score" must "be 0 when the player scored 0 in every step" in {
    rollMany(0, 20)
    
    game.score() should be (0)
  }
  
  it must "be 20 when the player scored 1 in every step" in {
    rollMany(1, 20)
    
    game.score() should be (20)
  }
  
  it must "be 10 plus next roll when the player scored spare" in {
    rollSpare()
    rollMany(3, 1)
    rollMany(0, 17)
    
    game.score() should be (16)
  }
  
  it must "be 10 plus next two rolls when the player scored strike" in {
    rollStrike()
    rollMany(4, 1)
    rollMany(3, 1)
    rollMany(0, 16)
    
    game.score() should be (24)
  }
  
  it must "be 300 in a perfect game" in {
    rollStrike()
    rollMany(10, 12)
    
    game.score() should be (300)
  }
  
  private def rollMany(pins: Int, times: Int) {
    1 to times foreach { _ => game.roll(pins) }  
  }
  
  private def rollSpare() {
    game.roll(5)  
    game.roll(5)   
  }
  
  private def rollStrike() {
    game.roll(10)  
  }
}