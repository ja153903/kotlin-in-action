fun main (args: Array<String>) {
    val timesTwo = { x: Int -> x * 2}
    val add = { x: Int, y: Int -> x + y}
    println(timesTwo(5))
    println(add(3, 4))

    val list = (1..100).toList()

    val evensOnly = list.filter { el: Int -> el % 2 == 0 }

    println(evensOnly)

    // using the it variable
    val evens = list.filter { it % 2 == 0 }

    println(evens)

    val evensFun = list.filter { it.even() }

    println(evensFun)

    val evensDoubleColon = list.filter(::isEven)

    println(evensDoubleColon)
}

fun isEven(i: Int) = i % 2 ==0
fun Int.even() = this % 2 == 0