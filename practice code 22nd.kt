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
    
    
