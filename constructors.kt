
class Country(val name: String, val areaSqKm: Int) {
//    val name: String = name
//    val area: Int = areaSqKm
//    init {
//        this.name = name
//        this.area = areaSqKm
//    }
    constructor(name: String): this(name, 0) {
        println("Constructor called")
    }
    fun print() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)
    println("${australia.name} has an area of ${australia.areaSqKm}")
    println(australia.print())

    val spain = Country("Spain")
    println(spain.print())
}