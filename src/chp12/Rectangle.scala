package chp12

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  // other methods
}

object Rect extends App {
  val rect = new Rectangle(new Point(1, 1 ), new Point(10, 10))
  println(rect.left + " " + rect.right + " " + rect.width)
}