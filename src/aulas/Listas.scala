package aulas

object Listas {
  def main(args: Array[String]): Unit = {
    val lista = List(1,11,21,31)

    //Head e Tail
    val listaHead = lista.head
    println("Head: " + listaHead)

    val listaTail = lista.tail
    println("Tail: " + listaTail)

    println(listaHead +: listaTail)

    //Map e Filter
    val valores = List(10,9,8)
    println(valores.map(_ + 1 +" é um número"))

    println(lista.filter(_ %2 == 0))

    //Map e FlatMap
    val par = (x: Int) => List(x, x+1)
    println(lista.flatMap(par))

    println(lista.map(par))

    val inteiros = List(1,2,3,4)
    val char = List("a", "b", "c", "d")

    println()
    println("FlatMap")
    val juncao = inteiros.flatMap(n => char.map(c => "" + c + n))
    println(juncao)
  }
}
