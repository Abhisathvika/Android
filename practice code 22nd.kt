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
