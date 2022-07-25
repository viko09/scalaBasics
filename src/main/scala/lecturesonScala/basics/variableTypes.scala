package lecturesonScala.basics

object variableTypes extends App{
  // Variable Declaration. Example 1
  val nameOfVariable: Int = 22
  println(nameOfVariable)

  // vals are IMMUTABLE

  // Variable Declaration. Example 2
  val x = 21
  println(x)
  // Compiler can infer types
// ------------------------------------------
  // Types of Variables
// Strings
  val aString: String = "This is a String Variable"

  val thisString: String = "This is a String Variable"; val anotherString = "Bye!" // Not the best style

  // Recommended style
  val secondString: String = "This is a String Variable"
  val thirdString = "Bye!"

// Booleans
  val aBool: Boolean = false
// Chars
  val aCharacter: Char = '&'
// Integers
  val aInt: Int = x
// Short
  val aShort: Short = 2456
// Long
  val aLong: Long = 2345882930284L
// Float
  val aFloat: Float = 2.04f
  val aSecondFloat: Float = 2.04
// Double
  val aDouble: Double = 3.141516

// Variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
// Whats the difference between val and var?? Answer: Variables can be reasigned
// Vals cannot be reasigned but Var can
}
