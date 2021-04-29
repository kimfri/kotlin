package interfaces.cafe

fun main() {
    val fred = Barista("Fred")
    val sam = Barista("Sam")

    fred.acceptOrder(CoffeeType.AMERICANO)
    sam.acceptOrder(CoffeeType.ESSPRESSO)

    Thread.sleep(5000L)
}
