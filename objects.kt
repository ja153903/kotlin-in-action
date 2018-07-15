import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

// an object is only there once (a singleton)
object CountryFactory {
    fun createCountry() = Country("Australia")
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    val australia = CountryFactory.createCountry()
    println("${australia.name} is my country")
}