
class City {
    // This is the more java way to do this
    // in kotlin, this is not how you would do it
    var name: String = ""
        get() = field // default implementation for getter
        set(value) { // default implementation for setter
            if (value.isNotBlank())
                field = value
        }

    var population: Int = 0
}

fun main(args: Array<String>) {
    val berlin = City()

    // These call the implicit setters in Kotlin
    berlin.name = "Berlin"
    berlin.name = "     " // this won't be updated
    berlin.population = 3_500_000

    // these call the implicit getters in Kotlin
    println("${berlin.name} has a poulation of ${berlin.population}")
}