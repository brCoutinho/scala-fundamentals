package aulas

object Listas {
  def main(args: Array[String]): Unit = {
    val lista = List(1,2,3,4)

    val listaHead = lista.head
    println("Head: " + listaHead)

    val listaTail = lista.tail
    println("Tail: " + listaTail)

    println(listaHead +: listaTail)

    val valores = List(10,9,8)
    println(valores.map(_ + 1 +" é um número"))

    println(lista.filter(_ %2 == 0))
  }
}
