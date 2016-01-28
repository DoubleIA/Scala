package chp13


/**
 * 
 * A simple name x . This includes x in the set of imported names.
 * A renaming clause x => y . This makes the member named x visible under the name y .
 * A hiding clause x => _ . This excludes x from the set of imported names.
 * A catch-all ‘ _ ’. This imports all members except those members mentioned in a preceding clause. 
 * If a catch-all is given, it must come last in the list of import selectors.
 * 
 */
abstract class Fruit(
  val name: String, 
  val color: String
)

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}