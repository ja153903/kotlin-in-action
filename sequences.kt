
fun main(args: Array<String>) {
    val veryLongList = (1..999999L).toList()

//    val sum_ = veryLongList
//                .asSequence()
//                .filter { it > 50 }
//                .map { it * 2 }
//                .take(1000)
//                .sum()
//
//    println(sum_)

    val seq = generateSequence(1) { it + 1 }
    println(seq.take(10).toList())
}