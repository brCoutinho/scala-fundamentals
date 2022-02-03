package aulas

object ScalaOOP extends App {

  var string : String = "Teste"

  string += " executado"
  println(string)

  println(math.sqrt(45))

  def soma(a: Int, b: Int): Int = {
    a + b
  }

  println(soma(1,3))


}
