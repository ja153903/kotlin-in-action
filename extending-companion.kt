class P(val firstName: String, val lastName: String) {
    companion object {
        ...
    }

    fun P.Companion.fromJSON(json: String): P {
        ...
    }
}

val p = P.fromJSON(json)

/*
This way we can extend the companion object as well
*/
