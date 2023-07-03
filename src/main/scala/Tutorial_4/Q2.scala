package Tutorial_4

object Q2 {
  def checkType(num: Int): String = num match {
    case no if no < 0 => "Negative"
    case no if no == 0 => "Zero"
    case no if no % 2 == 0 => "Even"
    case _ => "Odd"
  }

  def main(args: Array[String]): Unit = {
    printf("Enter a number: ")
    val number = io.StdIn.readInt()
    println(checkType(number))
  }
}
