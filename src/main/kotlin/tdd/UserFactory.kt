package tdd

class UserFactory {

    fun createUser(firstName: String, lastName: String = "Fritzon"): User {
        return User(firstName, lastName)
    }
}