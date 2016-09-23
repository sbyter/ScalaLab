/**
  * Created by HEBL on 04-07-2016.
  */

package test

import org.scalatest.FlatSpec

class TestMyScalaClass extends FlatSpec{
    "A Simple Test" should "always pass" in {
      assert(true)
    }

    "Another Test" should "pass" in {
      assert(true)
    }

    "Property" must "be accessible" in {
      case class point(x: Int)
      def orig = point(1)
      assert(orig.x == 1)
    }

    "Adding" should "return Int" in {
      def m = new MyScalaClass
      assert(m.AddInt(2,4) == 6)
    }

    "Sum" should "return" in {
      def m = new MyScalaClass
      //assert(m.sumInts(1,5) == 15)
      assert(m.t == 165)
    }

    "Text" should "display" in {
      def file = new FileLab
      file.out()
    }

    "Testing" should "collections" in {
      def m = new MyScalaClass
      println(m.f1)
      println(m.f2)
      println(m.f3)
      println(m.f4)
      println(m.f5)
    }
}
