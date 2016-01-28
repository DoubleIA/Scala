package chp7

object ListFile {
  val filesHere = (new java.io.File("/home/wangyingbo/scala")).listFiles

  def fileLines(file: java.io.File) = 
    scala.io.Source.fromFile(file).getLines.toList
  
  def scalaFiles = 
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file
  
  def grep(pattern: String) = 
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file + ": " + line.trim)
  
  val forLineLengths = 
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length
    
  def main(args: Array[String]) =
    forLineLengths.foreach(println)
}