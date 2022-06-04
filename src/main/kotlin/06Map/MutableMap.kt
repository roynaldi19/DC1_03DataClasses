package `06Map`

fun main() {
    var mutableCapital = mutableMapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
    println(mutableCapital["Jakarta"])
    println(mutableCapital.getValue("Berlin"))


}