package interfaces

interface CanEat {
    fun eat(food: String): Boolean
}

interface CanRun {
    fun run(): String
}

class FastMover: CanRun {
    override fun run(): String {
        return "Fast"
    }
}

class Dog: CanEat, CanRun by FastMover() {
    override fun eat(food: String): Boolean {
        TODO("Not yet implemented")
    }
}
