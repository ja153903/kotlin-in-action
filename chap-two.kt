import java.io.BufferedReader
import java.io.StringReader
import java.util.*
import javax.print.DocFlavor

//interface Expr
//
//class Num(val value: Int): Expr
//class Sum(val left: Expr, val right: Expr): Expr
//
////    if (e is Num) {
////        val n = e as Num
////        return n.value
////    }
////    if (e is Sum) {
////        return eval(e.left) + eval(e.right)
////    }
////    throw IllegalArgumentException("Unknown expression")
//
//fun eval(e: Expr): Int =
//    when (e) {
//        is Num -> e.value
//        is Sum -> eval(e.left) + eval(e.right)
//        else -> throw IllegalArgumentException("Unknown expression")
//    }

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun isLetter(c: Char): Boolean = c in 'a'..'z' || c in 'A'..'Z'

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    println(max(4, 3))
    //println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

    // use a treemap to sort the keys
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary;
    }

    for ((letter, binary) in binaryReps) {
        println("$letter : $binary")
    }

    readNumber(BufferedReader(StringReader("6")))
}