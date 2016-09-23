/**
  * Created by HEBL on 15-07-2016.
  */
package test

class FileLab {

  def out() = {
    val lines = scala.io.Source.fromFile("c:\\tmp\\data.txt").getLines()
    for(line <- lines){
      println("Line:", line)
    }
  }
}
