class Person(val name: String, val age: Int) {
    fun greet(): String = "I'm $name, $age years old"

    companion object {
        fun create(name: String): Person = Person(name, 0)
    }
}
