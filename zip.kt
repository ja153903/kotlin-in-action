fun main(args: Array<String>) {
    val list = listOf("Hi", "There", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)
    for ((s, b) in zipped) {
        println("$s, $b")
    }
}