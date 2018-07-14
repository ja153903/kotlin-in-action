
fun Bicyle.replaceWheel() {
    println("Replacing wheel")
}

fun main(args: Array<String>) {
    val vehicle: Drivable = Bicyle()
    vehicle.drive()

    // automatically casted into Bicycle
    if (vehicle is Bicyle) {
        vehicle.replaceWheel()
    }
}