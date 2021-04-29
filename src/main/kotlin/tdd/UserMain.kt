package tdd

fun main() {
    val user = UserFactory().createUser("Kim")
    println("$user")
}