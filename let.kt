import java.io.File

fun main(args: Array<String>) {
    // let()

    // scoping
//     File("example.txt").bufferedReader().let {
//         if (it.ready()) {
//             println(it.readLine())
//         }
//     }

    // reader should not be visible

    val str: String? = "Kotlin for Android"

    // No need to concern nullability because we let it into the let block
    str?.let {
        if (it.isNotEmpty()) {
            println(it.toLowerCase())
        }
    }

}