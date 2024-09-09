class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Simplifying the fraction using gcd
  private val gcdValue = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  def this(n: Int) = this(n, 1)

  // Negate the rational number
  def neg: Rational = new Rational(-numer, denom)

  // Helper method to compute the greatest common divisor
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  override def toString: String = s"$numer/$denom"
}

object TestRational extends App {
  val x = new Rational(1, 3)
  println(s"x: $x")
  println(s"Negation of x: ${x.neg}")
}
