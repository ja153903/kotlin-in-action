window.addMouseListener(object: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { ... }
    override fun mouseEntered(e: MouseEvent) { ... }
})

// we can pass in anonymous inner classes like Java
// but in Kotlin, we are passing an anonymous object
// Note that the object does not have a name

// Unlike Java however, you can implement multiple interfaces 
// with the Kotlin anonymous inner classes
// anonymous objects are not singletons (multiple instances
// of the anonymous object will be created on every call)


