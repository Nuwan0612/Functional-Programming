package Tutorial_4

object Q1 {
  def interest(amount: Int): Double = amount match {
    case amt if amt <= 20000 => amt * 0.02
    case amt if amt <= 200000 => amt * 0.04
    case amt if amt <= 2000000 => amt * 0.035
    case _ => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    println("Interest for the year: " + interest(1200))
  }
}
