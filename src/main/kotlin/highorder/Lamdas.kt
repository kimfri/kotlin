package highorder

fun main() {
    val x = 10
    val y = 15
    println("myAdder:  ${calc(x, y, myAdder)}")
    println("mySubber: ${calc(x, y, mySubber)}")
}

val myAdder: (Int, Int) -> Int = { x, y -> x + y }
val mySubber: (Int, Int) -> Int = { x, y -> x - y }

fun calc(addentOne: Int, addentTwo: Int, aFunc: (Int, Int) -> Int): Int {
    println("First value: $addentOne, Second value: $addentTwo")
    return aFunc(addentOne, addentTwo)
}