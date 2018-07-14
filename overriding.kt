interface Drivable {
   fun drive() = println("Driving (interface)")
}

abstract class Vehicle(open val brand: String = "") {
    open fun drive() {
        println("Driving")
    }
    abstract fun honk()
}

class Sedan(override var brand: String = "BRAND"): Vehicle(), Drivable {
    override fun drive() {
        super<Drivable>.drive()
    }
    override fun honk() {
        println("Honking")
    }
}