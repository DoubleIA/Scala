package chp9

/**
 * 
 * by-name parameter 叫名参数
 * 
 */
object Assert {
  var assertionsEnabled = false
  def byNameAssert(predicate: => Boolean) = 
    if (assertionsEnabled && !predicate)
      throw new AssertionError
      
  def myAssert(predicate: Boolean) = 
    if (assertionsEnabled && !predicate)
      throw new AssertionError
      
  def main(args: Array[String]) {
     val x = 1
     println("byNameAssert")
     byNameAssert(x / 0 == 0)
     println("myAssert")
     myAssert(x / 0 == 0)
   }
}