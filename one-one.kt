data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf<Person>(
            Person("Alice"),
            Person("Bob", age=29)
    )
    
    // returns 0 if age is null
    val oldest = person.maxBy { it.age ?: 0 }

    println("The oldest is $oldest")
}