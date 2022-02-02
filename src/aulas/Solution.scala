package aulas

object Solution {
  def main(args: Array[String]) : Unit = {
    val numeros = Array(1,2,3,4,5)

    numeros(3) = 485
    numeros.foreach(println)
  }
}
