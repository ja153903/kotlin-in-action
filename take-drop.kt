
fun main(args: Array<String>) {

    // this is infinitely long
    // but is lazy
    val list = generateSequence(0) {
        println("Calculating ${it + 10}")
        it + 10
    }
    val list2 = (1..1000).toList()

    // take
    // takes first n elements of a list
    val first10 = list.take(10).toList()
    println(first10)

    // drop
    // drops the first n elmenets of a list and returns the rest
    val withoutFirst900 = list2.drop(900)
    println(withoutFirst900)

    // useful for lazy sequences
}