// inlining a function will remove any overhead provided by the anonymous objects

// if you don't want the lambda to be inlined, then you would write noinline before the lambda
inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {
    modifyString("Kotlin is amazing") { it.toUpperCase() }
}