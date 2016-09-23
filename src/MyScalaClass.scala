/**
  * Created by HEBL on 04-07-2016.
  */
package test

class MyScalaClass {

  def AddInt(x: Int, y: Int): Int = {
    val res = x + y
    res
  }

  /*      |input func, Int, Int      | |return Int| */
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)

  def id(x: Int): Int = x
  def square(x: Int): Int = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  /**
    * currying
    * f: input func (Int => Int)
    * returns func: (Int, Int) => Int
    *    |input (func) |  |return (func)   | */
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }
  // equivalent to sum
  def sums(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sums(f)(a + 1, b)

// sum called with anonymous func x => X, x => x * x
// sumInts = sumF...
  def sumInts2 = sum(x => x)
  def sumSquares2 = sum(x => x * x)
  def sumPowersOfTwo2 = sum(powerOfTwo)

  val t = sumInts2(10, 20)

  val f = 10

  // Collections
  def f1: Range = (1 to 5)

  //Apply predicate on all elements where result is used as first parameter for next call to predicate
  // (1,2) (3,3) (6,4) (10,5)
  def f2: Int = (1 to 5).reduceLeft(_+_)

  def f3: IndexedSeq[Int] = (1 to 5).map(_*2)

  // Many ways to write the same expression
  // Filter seq modulus 2 and build map with product of 2
  def f4: IndexedSeq[Int] = (1 to 5).filter(_%2 == 0).map(_*2)
  def f5: IndexedSeq[Int] = (1 to 5) filter{_%2 == 0} map {_*2}

  def f6: IndexedSeq[Int] = (1 to 5) filter{_%2 == 0}


}
