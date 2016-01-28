package chp10

class Tiger (
  override val dangerous: Boolean,
  private var age: Int
) extends Cat

//相当于
/*class Tiger(param1: Boolean, param2: Int) extends Cat {
  override val dangerous = param1
  private var age = param2
}*/