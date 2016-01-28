package chp6

//implicit def intToRational(x: Int) = new Rational(x)

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)

  val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  
  def this(n: Int) = this(n, 1)
  
  override def toString = numer + "/" + denom
  
  def +(that: Rational): Rational = 
    new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
        )
  def +(i: Int): Rational = 
    new Rational(this.numer + i * this.denom, this.denom)

  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom)
  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  
  def *(i: Int): Rational =
    new Rational(numer * i, denom)
  
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  
  def /(i: Int): Rational =
    new Rational(numer, denom * i)
  
  def lessThan(that: Rational) = 
    this.numer * that.denom < that.numer * this.denom
    
  def max(that: Rational) = 
    if (this.lessThan(that)) that else this
    
  def compare(that: Rational) =
    this.numer * that.denom - that.numer * this.denom
    
  private def gcd(a: Int, b: Int): Int = 
    if (b == 0) a else gcd(b, a % b)
}

object Main extends App {
  val r1 = new Rational(1, 3)
  val r2 = new Rational(2, 3)
  println(r1 + r2)
  println(r1 * r2)
  println(r1 + r1 * r2)
  println(r1 > r2)
  println(r1 < r2)
}