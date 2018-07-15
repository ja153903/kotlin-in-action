interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int,
            val price: Double) {
    // these are like static
    // you can extend interfaces with companion objects
    // because they are objects are runtime
    companion object: HouseFactory {
        val HOUSE_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
        override fun createHouse(): House = getNormalHouse()
    }
}

fun main(args: Array<String>) {
    println(House.HOUSE_FOR_SALE)
    println(House.getNormalHouse())
    println(House.getLuxuryHouse())
}