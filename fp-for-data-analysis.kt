
fun getAverageAge(data: Map<String, List<Int>>): Double {
    val sumAges = data.flatMap { it.value }
            .sum()
    val numAges = data.map { it.value.size }
            .sum()
    return (sumAges / numAges).toDouble()

}

fun main(args: Array<String>) {
    // Some faulty data with ages of our users
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    // find total sum
    println(getAverageAge(data))

    // we can consider data faulty if the list is empty or if the list contains a negative number
    val faulty = data.filter {
        it.value.map { it < 0 }.contains(true) || it.value.isEmpty() }
    println(faulty.keys)


}