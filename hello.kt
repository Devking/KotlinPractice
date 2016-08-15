// Having a class body is not required
class PairWrap

class Bob {
}

// Single expression function
fun square (a: Int) = a * a

// Notice! The following is not allowed
// Parameter variables cannot be modified
// fun incrementValue (a: Int) = a += 1

// Generic function
fun <T> printer(thing: T) {
    println(thing)
}

// Required main function
fun main (args: Array<String>) {
    println("Hello, World!")

    val x = 5
    val y = 5

    // Lambda function
    val z = { a: Int, b: Int -> a + b }

    // Chain some functions
    printer(square(z(x,y)))
}
