package chp12

/**
 * 
 * linearization: Cat -> FourLegged -> HasLegs -> Furry -> Animal -> AnyRef -> Any
 * 
 * When any of these classes and traits invokes a method via super, 
 * the implementation invoked will be the first implementation to 
 * its right in the linearization.
 * 
 */
class Cat extends Animal with Furry with FourLegged