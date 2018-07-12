import kotlin.collections.joinToString as jst

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")

fun Button.showOff() = println("I'm a button!")

//fun <T> joinToString(
//        collection: Collection<T>,
//        separator: String,
//        prefix: String,
//        postfix: String
//): String {
//    val result = StringBuilder(prefix)
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0) result.append(separator)
//        result.append(element)
//    }
//    result.append(postfix)
//    return result.toString()
//}

sealed class Expr {
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.left) + eval(e.right)
        }

//class User(_nickname: String,
//           val isSubscribed: Boolean = true) {
//    val nickname: String = _nickname
//}

open class User(val nickname: String,
           val isSubscribed: Boolean)

class TwitterUser(nickname: String): User(nickname, true)
//class User constructor(_nickname: String) {
//    val nickname: String
//
//    init {
//        nickname = _nickname
//    }
//}

fun factorial(n: Int): Int {
    fun go(n: Int, acc: Int): Int {
        when (n) {
            1 -> return acc
            else -> return go(n - 1, acc * n)
        }
    }
    return go(n, 1)
}

fun main(args: Array<String>) {
    // set
    val set = setOf(1, 7, 53)
    // map
    val list = listOf(1, 7, 53)
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

//    println(joinToString(list,
//            separator=", ",
//            prefix="(",
//            postfix =")"))

    val view: View = Button()
    view.click()
    // Expected: I'm a view! because extension function is resolved statically
    view.showOff()

    val strings: List<String> = listOf("first", "second", "thirteenth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())

    val str: String = "12.32+3230-232.23+23.+-"
    val formattedStr: String = str.split("\\.|-|\\+".toRegex()).jst()

    println(formattedStr)

    println(factorial(4))
}