package expressions

object Expressions {

  def evaluate[A](expression: String,
                   converter: String => A,
                   operatorTable: Map[String, (A, A) => A],
                   order: List[List[String]]): A = {

    converter("")
  }

}
