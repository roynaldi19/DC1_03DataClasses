package `07CollectionsOperations`

fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}