
fun main(args: Array<String>) {
    val props = System.getProperties()

    // used if you want to make many calls with the same object
    // allows for concise and groups the set of statements logically
    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home").toList())
    }
}