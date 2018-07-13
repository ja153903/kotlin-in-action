import java.util.Random

fun main(args: Array<String>) {
    val input: String? = readLine()
    if (input.equals(null) || input.equals("")) {
        println("John Doe")
    } else {
        println(input)
    }

    val randomNumbers = mutableListOf<Int>()
    for (i in 1..100) {
        randomNumbers.add(Random().nextInt(100) + 1)
    }

    var i = 0

    while (i < randomNumbers.size && randomNumbers[i] > 10) {
        println(randomNumbers[i])
        i++
    }

}