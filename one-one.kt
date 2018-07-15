data class Person2(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf<Person2>(
            Person2("Alice"),
            Person2("Bob", age=29)
    )
    
    // returns 0 if age is null
    val oldest: Person2? = person.maxBy { it.age ?: 0 }

    println("The oldest is $oldest")
}