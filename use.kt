import java.io.FileReader

fun main(args: Array<String>) {
    // use() is available for all types who implement the Closeable interface
    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
    }
}