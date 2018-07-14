/*
classes are closed by default in Kotlin
Therefore, you have to label a class open if you want to inherit from it
 */

open class Base
class Child: Base()

open class Shape(val name: String) {
    open fun area() = 0.0 // so it can be overridden
}

class Circle(name: String, val radius: Double): Shape(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val c = Circle("Circle", 4.0)
    println(c.area())
}