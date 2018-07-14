
// Generates hashCode(), equals(), and toString(), copy(), and destructuring operator
data class Address(
        val street: String,
        val number: Int,
        val postCode: String,
        val city: String
) {
    override fun toString(): String {
        return "My address is $number $street, $city, $postCode"
    }
}

fun main(args: Array<String>) {
    val residence = Address(
            "Main Street",
            42,
            "1234",
            "New York"
    )

    val residence2 = Address(
            "Main Street",
            42,
            "1234",
            "New York"
    )

    println(residence)

    // Checks for referential equality
    println(residence === residence2)
    // Checks for structural equality
    println(residence == residence2)

    // Copy
    val neighbor = residence.copy(number=43)
    println(neighbor)

    // Destructuring operator
    val (street, number, postCode, city) = residence
    println(street)
    println(number)
    println(postCode)
    println(city)

}