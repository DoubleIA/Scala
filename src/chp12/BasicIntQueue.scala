package chp12

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

object BQ extends App {
  val queue = new BasicIntQueue
  queue.put(10)
  queue.put(20)
  println(queue.get())
  println(queue.get())
}