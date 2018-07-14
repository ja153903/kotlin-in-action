
enum class Direction(degree: Double) {
    NORTH(0.0), EAST(90.0), SOUTH(180.0), WEST(270.0)
}

enum class Suits {
    HEARTS, SPADES, DIAMONDS, CLUBS
}

fun main(args: Array<String>) {
    val suit = Suits.SPADES

    // WHen exhaustive, no need for else branch
    val color = when(suit) {
        Suits.HEARTS, Suits.DIAMONDS -> "red"
        Suits.SPADES, Suits.CLUBS -> "black"
    }

    println(color)
}