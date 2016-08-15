class PairWrap

class Bob {
}

fun square(a: Int) = a * a

fun main(args: Array<String>) {
    println("Hello, World!")

    val x = 5
    val y = 5
    val z = { a: Int, b: Int -> a + b }
    println(square(z(x,y)))
}
