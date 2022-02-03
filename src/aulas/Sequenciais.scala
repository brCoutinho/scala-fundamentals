package aulas

object Sequenciais {
  def main(args: Array[String]): Unit = {

    val umaSequencia = Seq(1,3,5,4)
    println(umaSequencia.reverse)

    val novaSeq = umaSequencia ++ Seq(6,8,10)
    println(novaSeq.sorted.reverse)
  }
}
