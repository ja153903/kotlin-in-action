
//interface Drivable {
//    fun drive()
//}

class Bicyle: Drivable {
    override fun drive() {
        println("Riding a bicycle")
    }
}

fun main(args: Array<String>) {
    val b: Drivable = Bicyle()
    b.drive()
}