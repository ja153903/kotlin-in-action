import java.util.*

val list: List<Int> = listOf(1, 2, 3)

class TimeSeries<E> {
    val date2data = mutableMapOf<Date, E>()

    fun add(element: E) {
        date2data.put(Date(), element)
    }

    fun getLatestElement(): E = date2data.values.last()
}

fun <E> timeSeriesOf(vararg elements: E): TimeSeries<E> {
    val result = TimeSeries<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main(args: Array<String>) {
    val timeline: TimeSeries<Int> = TimeSeries()
    timeline.add(2)
    println(timeline.getLatestElement())
    
    val timeline2: TimeSeries<Int> = timeSeriesOf(1, 2, 3)
}