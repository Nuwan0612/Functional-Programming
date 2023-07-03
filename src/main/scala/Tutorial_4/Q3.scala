package Tutorial_4

object Q3 {
  def toUpper(str: String): String = str.toUpperCase()

  def toLower(str: String): String = str.toLowerCase()

  def indexToUpper(str: String): String = {
    println(str)
    printf("Enter the index want to change: ")
    val index = io.StdIn.readInt()
    str.updated(index, str.charAt(index).toUpper)
  }

  def indexToLower(str: String): String = {
    println(str)
    printf("Enter the index want to change: ")
    val index = io.StdIn.readInt()
    str.updated(index, str.charAt(index).toLower)
  }

  def formatNames(name: String)(func: String => String): String = {
    func(name)
  }

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(indexToUpper))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(indexToUpper))

  }
}
