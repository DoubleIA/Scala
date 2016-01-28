package chp9

import java.io.File

//curry 化
object PrintWriter {
  def withPrintWriter(file: File)(op: java.io.PrintWriter => Unit) {
    val writer = new java.io.PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close
     }
  }
  
  def main(args: Array[String]) =
    withPrintWriter(new File("date.txt")) {
      _.println(new java.util.Date)
    }
  
  //还有更好的方式
/*  def withPrintWriter(file: File, op: java.io.PrintWriter => Unit) {
    val writer = new java.io.PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close
     }
  }
  
  def main(args: Array[String]) = 
    withPrintWriter(new File("date.txt"), _.println(new java.util.Date))*/
}