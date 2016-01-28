package chp7

object Match {
  def main(args: Array[String]) {
    val firstArg = if (args.length > 0) args(0) else ""
     
    val friends = 
      firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }
    
    println(friends)
  }
}