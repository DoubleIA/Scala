package chp12

/**
 * 
 * the trait must be mixed into some class that has a concrete definition of the method in question
 * 
 */
class MyQueue extends BasicIntQueue with Doubling


/**
 * 
 * the trait can only be mixed into a class that also extends IntQueue
 * the trait is mixed in after another trait or class that gives a concrete definition to the method
 * 
 * you should keep your eyes open for opportunities to arrange code as stackable modifications
 * 
 */
trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}


object MQ extends App {
  // with MyQueue
  val queue = new MyQueue
  queue.put(10)
  println("MyQueue: queue.put(10); queue.get() = " + queue.get())
  
  println("=================================================================================================================================")
  
  // without MyQueue
  val mq = new BasicIntQueue with Doubling
  mq.put(10)
  println("new BasicIntQueue with Doubling: queue.put(10); queue.get() = " + mq.get())
  
  println("=================================================================================================================================")
  
  /**
   * 
   * The order of mixins is significant
   * traits further to the right take effect first
   * 
   */
  
  // stack modifications
  val sm = new BasicIntQueue with Incrementing with Filtering
  sm.put(-1); sm.put(0); sm.put(1)
  println("new BasicIntQueue with Incrementing with Filtering: queue.put(-1);queue.put(0);queue.put(1); first queue.get() = " + sm.get())
  println("new BasicIntQueue with Incrementing with Filtering: queue.put(-1);queue.put(0);queue.put(1); second queue.get() = " + sm.get())
  
  println("=================================================================================================================================")
  
  // reverse mixins order
  val smrev = new BasicIntQueue with Filtering with Incrementing
  smrev.put(-1); smrev.put(0); smrev.put(1)
  println("new BasicIntQueue with Filtering with Incrementing: queue.put(-1);queue.put(0);queue.put(1); first queue.get() = " + smrev.get())
  println("new BasicIntQueue with Filtering with Incrementing: queue.put(-1);queue.put(0);queue.put(1); second queue.get() = " + smrev.get())
  println("new BasicIntQueue with Filtering with Incrementing: queue.put(-1);queue.put(0);queue.put(1); third queue.get() = " + smrev.get())
  
}