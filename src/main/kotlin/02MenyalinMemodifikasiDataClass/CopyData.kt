package `02MenyalinMemodifikasiDataClass`

data class DataUser(val name: String, val age: Int)

fun main() {
    val dataUser = DataUser("Roy", 29)
    val dataUser2 = dataUser.copy()

    println(dataUser)
    println(dataUser2)
}