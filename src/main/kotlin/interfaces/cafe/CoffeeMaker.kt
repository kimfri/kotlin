package interfaces.cafe

import kotlinx.coroutines.*

class CoffeeMaker {
    fun brewCoffee(type: CoffeeType, callback: OnCoffeeBrewedListener) {
        val madeCoffee = Coffee(type)

        GlobalScope.launch { // launch a new coroutine in background and continue
            delay(type.brewtime) // non-blocking delay for 1 second (default time unit is ms)
            callback.onCoffeeBrewed(madeCoffee)
        }
    }
}
