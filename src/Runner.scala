/**
  * Created by HEBL on 31-08-2016.
  */
object Runner {

  def main(args: Array[String]): Unit = {
    println(fibo(10,0))
  }

  def fibo(n: Int, f: Int): Int ={
    if(n == 0) f
    else fibo(n-1, f+n)
  }
}
