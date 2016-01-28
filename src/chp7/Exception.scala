package chp7

import java.net.URL
import java.net.MalformedURLException

object Exception {
  def urlFor(path: String) = 
    try {
      new URL(path)
    } catch {
      case e : MalformedURLException =>
        new URL("http://www.scalalang.org")
    } 
  
  def f(): Int = try { return 1 } finally { return 2 }
  
//  def g(): Int = try { 1 } finally { 2 }
  
  def main(args: Array[String]) = 
    println("urlFor(\"www.baidu.com\"): " + urlFor("www.baidu.com") + /*", g(): " + g() + */", f(): " + f())
}