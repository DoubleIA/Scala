package chp12

/**
 * 
 * Traits can declare fields and maintain state
 * you can do anything in a trait definition that you can do in a class definition
 * the syntax looks exactly the same, with only two exceptions
 * 
 * First: a trait cannot have any “class” parameters
 * Second: in classes, super calls are statically bound, in traits, they are dynamically bound
 * 
 * Scala traits can contain concrete methods, they make rich interfaces far more convenient
 * 
 * To enrich an interface using traits, simply define a trait with a small number of abstract methods—
 * the thin part of the trait’s interface—and a potentially large number of concrete methods, 
 * all implemented in terms of the abstract methods. Then you can mix the enrichment trait into a class, 
 * implement the thin portion of the interface, and end up with a class that has all of the rich interface available.
 * 
 */
class Frog extends Animal with Philosophical /*with HasLegs*/ {
  override def toString = "green";
  
  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
  
}

trait Philosophical {
  def philosophize() {
    println("I consum memory, therefore I am!")
  }
}

object Main extends App {
  val frog = new Frog
  frog.philosophize()
  // variable phil could have been initialized with any object whose class mixes in Philosophical
  val phil: Philosophical = frog
  phil.philosophize()
}