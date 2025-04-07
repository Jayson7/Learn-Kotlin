/*

Kotlin Variables

Variables are containers for storing data values.

To create a variable, use var or val, and assign a value to it with the equal sign (=):


 */
fun main (){

 var name = "jayson"
 println("\n", name "\n")

 val os = "Linux before windows"

 println(os)


// data types
val myNum = 5             // Int
val myDoubleNum = 5.99    // Double
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Hello" 
  println(myNum)
  println(myDoubleNum)
  println(myLetter)
  println(myBoolean)
  println(myText)


//   specify data type

val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String

// short is also a type of integer 

  val myNum: Short = 5000
  println(myNum)

  println(3 + 3)


   val firstName = "John "
  val lastName = "Doe"
  val fullName = firstName + lastName
  println(fullName)
    }