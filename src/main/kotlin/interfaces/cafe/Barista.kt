package interfaces.cafe

class Barista(private val name: String) : OnCoffeeBrewedListener {
    private val coffeeMaker = CoffeeMaker()

    fun acceptOrder(type: CoffeeType) {
        coffeeMaker.brewCoffee(type, this)

    }

    override fun onCoffeeBrewed(coffee: Coffee) {
        println("$name: finished brewing ${coffee.type}")
    }
}
