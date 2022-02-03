package aulas

object Maps {
  def main(args: Array[String]): Unit = {
    val gps = Map("pais" -> "Brasil", "cidade" -> "Florianopolis", "bairro" -> "Trindade")
    println(gps)
    gps.map(println)
  }
}
