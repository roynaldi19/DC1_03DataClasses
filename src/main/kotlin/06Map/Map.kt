package `06Map`

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(capital)
    println(capital["Jakarta"])
    println(capital.getValue("London"))
    println()

    println(mapKeys)
    println(mapValues)

}