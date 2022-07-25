package lecturesonScala.basics

object expressionsTypes extends App{
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3*4)
  // Math Operators:  + - * / & | ^ << >>
  // Special Scala Operator: >>> (right shift with zero extension)

  println(1 == x)
  // ==  !=  < > >= <=
  println(!(1 == x))
  // &&  !  ||
  var aVariable = 2
  aVariable /= 3 // += -= *=  *Only works with variables not with values

  // Instruction (DO) VS Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  // In scala, IF is an expression, not an instruction

  //----------------------------------
  // Never write this ^ , everything in Scala is an expression

  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3) // Unit === Void

}
