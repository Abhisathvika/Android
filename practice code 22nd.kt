fun main(){
    var a=10
    var b= 5
    val isTrue= true
    val isFalse= false
    val add= a+b
    var sub= a-b
    var multiple= a*b
    var divide= a/b
    //Arithmetic operators
    
    println("Arithmetic Operators:\n")
    println("Addition: $a + $b = $add")
    println("Multiplication: $a * $b = $multiple")
    println("Subtraction: $a - $b = $sub")
    println("Division: $a / $b = $divide")
    println("Modulus: $a % $b = ${a%b}")
    println("\n")
    
    //Relational Operators
    println("Relational Operators")
    println("\nGreater than: $a > $b= ${a>b}")
    println("Lesser than: $a <$b= ${a<b}")
    println("Greater than or equal: $a >= $b = ${a>=b}")
    println("Lesser than or equal: $a <= $b = ${a<=b}")
    println("Is equal to: $a == $b = ${a==b}")
    println("Not equal to: $a != b = ${a!=b}")
    
    //Assignment Operators
    println("\nAssignment Operator\n")
    a+=b
    println("After add b val of a: $a")
   a-=b
    println("After sub b from a: $a")
    a*=b
    println("After multiplying b val with a: $a")
   a/=b
    println("After div b from a: $a")
    
    a%=b
    
    
    
   var c= 10
    //Unary Operators
    println("\nUnary Operator\n")
    println("Unary plus of c: ${+c}")
    println("Unary minus of c: ${-c}")
    println("Increment of c: ${++c}")
    println("Decrement of c: ${--c}")
    
    //26th August
    fun main(){
    val temperature=25
    if(temperature>=20)
    {
        println("It is a warm day")
    }
    
    //if-else statement
    val age=18
    if(age>=18){
        println("You are an adult")
    }
    else{
        println("You are a child")
    }
    
    val score= 80
    println("\nGrading system")
    if(score>=95){
        println("A grade")
    }
    else if(score>=85){
        println("B grade")
    }
    else if(score>=70){
        println("C grade")
    }
    else{
        println("D grade")
    }

//construct a calculator by using if-else, else if for all arithmetic operators

println("\nCalculator")
val num1=10
val num2=20
val input= '+'
if(input=='+'){
    println("Perform addition:")
    val add= num1+num2
    println("Sum is: $add")
    
}
else if( input=='-'){
    println("Subtraction")
    var sub= num1-num2
    println("After subtraction, res is $sub")
}
else if( input=='*'){
    println("Multiplication")
    val mul= num1*num2
    println("Product is $mul")
}
else if(input=='/'){
    
    println("Division")
    if (num2!=0){
    val div= num1/num2
    println("Result after division is $div")
    }
    else{
        println("Division by zero")
    }
}


//age classification
println("\nAge classification")
val age1= 19
if(age1<13){
    println("Child")
}
else if(age1 in 13..19){
    println("Teenager")
}
else{
    println("Adult")
}


//when statement
println("\nExample of when statement")
val dayofWeek= 3
    val dayname= when(dayofWeek)
    {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else->"Invalid day"
        
    }
    println(dayname)
    
    //example-2 for when as a statement
    val num= 8
    when{
        num%2==0->println("$num is Even")
       num%2!=0->println("$num is Odd")
       else ->println("Unexpected number")
       
    }
    }

    //27th August
    /*
fun main(){
    for(i in 1..5){
        println("Number: $i")
    }
    for(j in 1 until 6){
        println("Numbers: $j")
    }
    //reverse loop
    println("\nReverse loop")
    for(k in 5 downTo 2){
        println(k)
    
    }
    println("")
    println("Reverse with a step of 2")
    for(l in 5 downTo 1 step 2){
        println(l)
    }
    //Iterating over the list
    println("\nIterating over a list")
    val fruits= listOf("Apple", "Banana", "Cherry")
    for(fruit in fruits){
        println("Fruit: $fruit")
    }
    
    
    //Iterating over the list with the indices
    /*for(fruit in fruits.indices){
        println("Fruit at index $index: ${fruits[index]}")
    }
    */
    
    
    //while loop
    /*println("\nWhile loop")
    var num=8
    while(num>0){
        println("Value is: $num")
        num--
    }
    */
    
    
    //Do-while loop
    println("Do while loop")
    var num2= 1
    do{
        println("value: $num2")
        num2++
    }
    while(num2 <= 5)
    
    
    println("\nNumbers in reverse order")
    var num3= 5
    do{
        println("value: $num3")
        num3--
    }
    while(num3 >=1 )
   
    
}
*/

  //Functions in Kotlin
    //Types are : predefined and user- defined
    //Built in: println(), str.length(), readLine(), uppercase(), lowercase()
    
/*fun demo(){
    println("Hello World!")
    
}
fun main(args: Array<String>){
    demo()
    println("Bye!")
    
}
*/


//28th August 2024 Homework

/*fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

fun main() {
    print("Enter a number: ")
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is: $result")
}

//fibonacci number
fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val number = 10  // Specify the number of terms here
    println("Fibonacci series up to $number terms:")
    for (i in 0 until number) {
        print("${fibonacci(i)} ")
    }
}
*/

//1st september, 2024
/Primary and secondary constructors

//Primary constructor is a simple, concise way to initialise a class. It's defined right after the class name. It is used when you want to set up properties 
// as the object is created
//Secondary constructor is an additional way to create an object



//Using a secondary constructor
/*class Person{
    var name: String
    var age: Int
    
    constructor(x: String, y: Int){
        this.name= x
        this.age= y
    }
    constructor(x:String){
        this.name=x
        this.age=0
    }
    constructor(){
        this.name= "Rahul"
        this.age= 32
    }
    fun intro(){
        println("my name is $name and age is $age")
    }
    

}
fun main(){
    var a= Person("Riya", 22)
    a.intro()
    var b= Person()
    b.intro()
    var c= Person("Heena")
    c.intro()
}
*/


//Using a primary constructor

/*class Person(var name: String, var age:Int){
    constructor(x:String):this(){
        this.name=x
        this.age=0
        
    }
    constructor(): this("rahul", 50)
    fun intro(){
        println("my name is $name and age is $age")
    }
}
fun main(){
    var a= Person("Riya", 22)
    a.intro()
    var b= Person()
    b.intro()
    var c= Person("Heena")
    c.intro()
}
*/


//Inheritance in Kotlin


/*open class Rectangle(val a: Double, val b:Double){
    fun area(): Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimensions $a*$b is ${area()}")
    }
}
class Square(side:Double):Rectangle(side, side){
    override fun display(){
        println("area of square with dimensions $a is ${area()}")
    }
}
fun main(){
    val mySquare= Square(3.0)
    mySquare.display()
    val myRectangle= Rectangle(4.0, 5.0)
    myRectangle.display()
}

*/
