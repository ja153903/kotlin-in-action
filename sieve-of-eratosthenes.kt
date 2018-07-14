
fun main(args: Array<String>) {
    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }
    val primes = generateSequence(2 to possiblePrimesAfter2) {
        val p = it.second.first()
        val possiblePrimesAfterP = it.second.filter { it % p != 0 }
        p to possiblePrimesAfterP
    }.map { it.first }
    println(primes.take(10).toList())
}