package tdd.calc

class Calc {

    fun add(x: Int, y: Int) = x + y

    fun sub(x: Int, y: Int) = x - y

    fun div(x: Int, y: Int): Double {
        if ( y == 0 ) { throw ArithmeticException("Division by Zero") }
        return x.toDouble() / y.toDouble()
    }
}