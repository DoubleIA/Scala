package chp7

//指令式编程 不推荐 重构为函数式编程 
object PrintMultiTable {
  def printMultiTable() {
    var i = 1
    
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        val prod = (i * j).toString
        var k = prod.length
        while (k < 4) {
          print(" ")
          k += 1
          }
        print(prod)
        j += 1
        }
      println()
      i += 1
     }
  }
  
  def main(args: Array[String]) = 
    printMultiTable()
}