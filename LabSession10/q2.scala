class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Simplify the fraction using gcd
  private val gcdValue = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  def this(n: Int) = this(n, 1)

  // Negate the rational number
  def neg: Rational = new Rational(-numer, denom)

  // Subtract two rational numbers
  def sub(that: Rational): Rational = {
    new Rational(
      numer * that.denom - denom * that.numer,
      denom * that.denom
    )
  }

  // Helper method to compute the greatest common divisor
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  override def toString: String = s"$numer/$denom"
}

object TestRational extends App {
  val x = new Rational(3, 4)  // 3/4
  val y = new Rational(5, 8)  // 5/8
  val z = new Rational(2, 7)  // 2/7

  // Find x - (y - z)
  val result = x.sub(y.sub(z))
  
  println(s"x: $x")
  println(s"y: $y")
  println(s"z: $z")
  println(s"Result of x - (y - z): $result")
}
