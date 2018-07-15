open class Being
open class Person: Being()
class Student: Person()

/**
 * Covariance = we can use a subtype
 */
fun main(args: Array<String>) {
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) // covariance

    val p: Person = Student()

    // Read-only collections are covariant
    val students: List<Person> = listOf<Student>()

    // cannot do this because of inconsistencies that come with this declaration
    // val students2: MutableList<Person> = mutableListOf<Student>()
}