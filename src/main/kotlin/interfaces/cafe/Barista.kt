package interfaces.cafe

class Barista(private val name: String) {
    private val coffeeMaker = CoffeeMaker()

    fun acceptOrder(type: CoffeeType) {
        coffeeMaker.brewCoffee(type, object : OnCoffeeBrewedListener {
            override fun onCoffeeBrewed(coffee: Coffee) {
                println("$name: finished brewing ${coffee.type}")
            }
        })
    }
}
