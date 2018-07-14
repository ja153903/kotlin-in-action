
// We are xtending the Int class by adding the isEven
fun Int.isEven() = this % 2 == 0

fun City.isLarge() = population > 1_000_000

fun main(args: Array<String>) {
    println(4.isEven())
    val austin = City()
    austin.name = "Austin"
    austin.population = 950_000
    println(austin.isLarge())
}