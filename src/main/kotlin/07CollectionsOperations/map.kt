package `07CollectionsOperations`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val diKaliLima = numberList.map { it * 5 }
    println(diKaliLima)

}