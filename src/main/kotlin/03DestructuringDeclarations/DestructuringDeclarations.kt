package `03DestructuringDeclarations`

data class DataUser(val name: String, val age: Int)

fun main() {
    val dataUser = DataUser("Roy", 29)
//    val name = dataUser.name
//    val age = dataUser.component2()
    val (name, age) = dataUser //mengambil berdasarkan urutan data

    println("My name is $name, I am $age")


}