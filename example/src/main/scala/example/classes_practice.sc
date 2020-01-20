class Rational(x: Int, y: Int){
  def num = x
  def den = y

  def add(that: Rational) = {
    new Rational(
      num*that.den + den*that.num, den*that.den
    )
  }

  def sub(that: Rational) = {
    new Rational(
      num*that.den - den*that.num, den*that.den
    )
  }

  def neg() = {
    -1*num
  }

  override def toString = num + "/" + den

}

object Rationals {
  val x = new Rational(1, 2)
}

Rationals
