import scala.io.StdIn.readLine
object ExerciseAug16BonusCalculator extends App {
  println("Xmas bonus calculator")
  val PersonsName = readLine(s"Whats is your name, sir/madam?")
  println (s"Great to meet you! Lets calculate your Christmas bonus!")
  val YearsWorked= readLine( s"$PersonsName, how long have you worked for the company?").toInt
  if ( YearsWorked < 2 ) {
    println(s"I m sorry $PersonsName, you are not entilted to Chrismas bonus this year. ")
  } else println("Lets calculate your Chrismas Bonus!")
  val Salary = readLine (s"$PersonsName, what's your monthly salary?").toDouble
  val YearlyBonus = Salary * 15 / 100 * YearsWorked.toDouble
  println (s"Your bonus is ${YearlyBonus}")

